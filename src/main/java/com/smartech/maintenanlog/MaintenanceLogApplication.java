package com.smartech.maintenanlog;

import com.smartech.maintenanlog.db.ActivityDAO;
import com.smartech.maintenanlog.db.LoginDAO;
import com.smartech.maintenanlog.db.OrdemDAO;
import com.smartech.maintenanlog.db.PartDAO;
import com.smartech.maintenanlog.resources.OrdemResource;
import com.smartech.maintenanlog.resources.LoginResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

/**
 * Created by jpedro on 06-11-2014.
 */
public class MaintenanceLogApplication extends Application<MaintenanceLogConfiguration> {
    public static void main(String[] args) throws Exception {
        new MaintenanceLogApplication().run(args);
    }

    @Override
    public String getName() {
        return "MaintenanceLog";
    }

    @Override
    public void initialize(Bootstrap<MaintenanceLogConfiguration> maintenanceLogConfigurationBootstrap) {

    }

    @Override
    public void run(MaintenanceLogConfiguration configuration, Environment environment) throws Exception {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), getName());
        final LoginDAO loginDAO = jdbi.onDemand(LoginDAO.class);
        final OrdemDAO ordemDAO = jdbi.onDemand(OrdemDAO.class);
        final PartDAO partDAO = jdbi.onDemand(PartDAO.class);
        final ActivityDAO activityDAO = jdbi.onDemand(ActivityDAO.class);

        final LoginResource loginResource = new LoginResource(loginDAO);
        environment.jersey().register(loginResource);

        final OrdemResource ordemResource = new OrdemResource(ordemDAO, partDAO, activityDAO);
        environment.jersey().register(ordemResource);
    }
}
