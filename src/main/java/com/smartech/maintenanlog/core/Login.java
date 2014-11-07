package com.smartech.maintenanlog.core;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    private long id;

    private String user;
    private String password;
    private String perfil;
    private String name;
    private String lastName;
    private String tecNumber;
    private String tecCategory;
    public Login(long id, String user, String password, String perfil, String name, String lastname, String tecNumber, String tecCategory) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.perfil = perfil;
        this.name = name;
        this.lastName = lastname;
        this.tecNumber = tecNumber;
        this.tecCategory = tecCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTecNumber() {
        return tecNumber;
    }

    public void setTecNumber(String tecNumber) {
        this.tecNumber = tecNumber;
    }

}

