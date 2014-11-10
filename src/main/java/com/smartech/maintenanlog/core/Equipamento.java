package com.smartech.maintenanlog.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpedro on 07-11-2014.
 */
public class Equipamento {
    private final long id;
    private final String number;
    private final String name;
    private final String localizacao;
    private List<HistoryEntry> historyEntries;
    private HistoryEntry nextHistoryEntry;

    public Equipamento(long id, String number, String name, String localizacao) {

        this.id = id;
        this.number = number;
        this.name = name;
        this.localizacao = localizacao;
    }

    public void addHistoryEntry(HistoryEntry historyEntry){
        if(historyEntries == null){
            historyEntries = new ArrayList<HistoryEntry>();
        }

        historyEntries.add(historyEntry);
    }

    public List<HistoryEntry> getHistoryEntries() {
        return historyEntries;
    }

    public void setHistoryEntries(List<HistoryEntry> historyEntries) {
        this.historyEntries = historyEntries;
    }

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setNextHistoryEntry(HistoryEntry nextHistoryEntry) {
        this.nextHistoryEntry = nextHistoryEntry;
    }

    public HistoryEntry getNextHistoryEntry() {
        return nextHistoryEntry;
    }
}
