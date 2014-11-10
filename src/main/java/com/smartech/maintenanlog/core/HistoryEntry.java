package com.smartech.maintenanlog.core;

/**
 * Created by jpedro on 07-11-2014.
 */
public class HistoryEntry {
    private final long id;
    private final String date;
    private final String tec;

    public HistoryEntry(long id, String date, String tec) {
        this.id = id;
        this.date = date;
        this.tec = tec;
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTec() {
        return tec;
    }
}
