package com.smartech.maintenanlog.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jpedro on 07-11-2014.
 */
public class Equipamento {
    private List<HistoryEntry> historyEntries;

    public void addHistoryEntry(HistoryEntry historyEntry){
        if(historyEntries == null){
            historyEntries = new ArrayList<HistoryEntry>();
        }

        historyEntries.add(historyEntry);
    }

    public List<HistoryEntry> getHistoryEntries() {
        return historyEntries;
    }

}
