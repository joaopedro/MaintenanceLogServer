package com.smartech.maintenanlog.core;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by jpedro on 07-11-2014.
 */
public class Ordem {
    private long id;
    private String orderNumber;
    private String periodicity;
    private String periodicityCode;
    private String type;
    private Calendar date;
    private String state;
    private String tecNumber;
    private String obs;
    private Equipamento equipament;
    private List<Part> parts;
    private List<Activity> activities;

    public Ordem(long id,  String orderNumber, String periodicity, String periodicityCode, String type, Calendar date,
                 String state, String tecNumber, String obs){
        this.id = id;
        this.orderNumber = orderNumber;
        this.periodicity = periodicity;
        this.periodicityCode = periodicityCode;
        this.type = type;
        this.date = date;
        this.state = state;
        this.tecNumber = tecNumber;
        this.obs = obs;
    }

    public void addPart(Part part){
        if(parts == null){
            parts = new ArrayList<Part>();
        }

        parts.add(part);
    }

    public void addActivity(Activity activity){
        if(activities == null){
            activities = new ArrayList<Activity>();
        }

        activities.add(activity);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Equipamento getEquipament() {
        return equipament;
    }

    public void setEquipament(Equipamento equipament) {
        this.equipament = equipament;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTecNumber() {
        return tecNumber;
    }

    public void setTecNumber(String tecNumber) {
        this.tecNumber = tecNumber;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getPeriodicityCode() {
        return periodicityCode;
    }

    public void setPeriodicityCode(String periodicityCode) {
        this.periodicityCode = periodicityCode;
    }
}
