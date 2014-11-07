package com.smartech.maintenanlog.resources;

import com.codahale.metrics.annotation.Timed;
import com.smartech.maintenanlog.core.Ordem;
import com.smartech.maintenanlog.db.OrdemDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jpedro on 07-11-2014.
 */
@Path("/ordem")
@Produces(MediaType.APPLICATION_JSON)
public class OrdemResource {
    private final OrdemDAO ordemDao;

    public OrdemResource(OrdemDAO ordemDAO) {
        this.ordemDao = ordemDAO;
    }

    @GET
    @Timed
    public List<Ordem> getAll(){
        return ordemDao.findAll();
    }

    @GET
    @Timed
    @Path("/tecnico/{number}")
    public List<Ordem> getByTecnico(@PathParam("number") String number){
        return ordemDao.findByTecnicno(number);
    }

}
