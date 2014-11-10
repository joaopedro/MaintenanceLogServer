package com.smartech.maintenanlog.core;

/**
 * Created by jpedro on 07-11-2014.
 */
public class Activity {
    private final long id;
    private final String discription;
    private final String type;

    public Activity(long id, String discription, String type) {
        this.id = id;
        this.discription = discription;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getDiscription() {
        return discription;
    }

    public String getType() {
        return type;
    }
}
