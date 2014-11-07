package com.smartech.maintenanlog.resources;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.smartech.maintenanlog.core.Login;
import com.smartech.maintenanlog.db.LoginDAO;
import com.smartech.maintenanlog.db.OrdemDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
public class LoginResource {
    private LoginDAO loginDAO;

    public LoginResource(LoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }



    @GET
    @Timed
    public List<Login> getLogins() {
        return loginDAO.findAll();
    }
}