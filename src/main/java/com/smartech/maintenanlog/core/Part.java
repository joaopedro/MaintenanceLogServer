package com.smartech.maintenanlog.core;

/**
 * Created by jpedro on 07-11-2014.
 */
public class Part {
    private final long id;
    private final String discription;

    public Part(long id, String discription) {
        this.id = id;
        this.discription = discription;
    }

    public long getId() {
        return id;
    }

    public String getDiscription() {
        return discription;
    }
}
