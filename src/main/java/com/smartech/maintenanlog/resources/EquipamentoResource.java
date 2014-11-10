package com.smartech.maintenanlog.resources;

import com.codahale.metrics.annotation.Timed;
import com.smartech.maintenanlog.core.Equipamento;
import com.smartech.maintenanlog.db.EquipamentoDAO;
import com.smartech.maintenanlog.db.HistoryEntryDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by jpedro on 07-11-2014.
 */
@Path("/equipamento")
@Produces(MediaType.APPLICATION_JSON)
public class EquipamentoResource {
    private final HistoryEntryDAO historyEntryDAO;
    private final EquipamentoDAO equipamentoDAO;


    public EquipamentoResource(HistoryEntryDAO historyEntryDAO, EquipamentoDAO equipamentoDAO) {
        this.historyEntryDAO = historyEntryDAO;
        this.equipamentoDAO = equipamentoDAO;
    }

    @GET
    @Timed
    public List<Equipamento> getAll(){
        List<Equipamento> allEquipamentos = equipamentoDAO.findAll();

        for (Equipamento equipamento : allEquipamentos) {
            equipamento.setHistoryEntries(historyEntryDAO.findByEquipamento(equipamento.getNumber()));
            equipamento.setNextHistoryEntry(historyEntryDAO.getNext(equipamento.getNumber()));
        }

        return allEquipamentos;
    }

}
