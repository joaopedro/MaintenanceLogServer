package com.smartech.maintenanlog.resources;

import com.codahale.metrics.annotation.Timed;
import com.smartech.maintenanlog.core.HistoryEntry;
import com.smartech.maintenanlog.core.Ordem;
import com.smartech.maintenanlog.db.ActivityDAO;
import com.smartech.maintenanlog.db.HistoryEntryDAO;
import com.smartech.maintenanlog.db.OrdemDAO;
import com.smartech.maintenanlog.db.PartDAO;

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
    private final PartDAO partDao;
    private final ActivityDAO activityDao;
    private final HistoryEntryDAO historyEntryDAO;

    public OrdemResource(OrdemDAO ordemDAO, PartDAO partDao, ActivityDAO activityDao, HistoryEntryDAO historyEntryDAO) {
        this.ordemDao = ordemDAO;
        this.partDao = partDao;
        this.activityDao = activityDao;
        this.historyEntryDAO = historyEntryDAO;
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
        List<Ordem> byTecnico = ordemDao.findByTecnico(number);

        for (Ordem ordem : byTecnico) {
            ordem.setParts(partDao.findByEquipamentoAndPeriodicaidade(ordem.getEquipament().getNumber(), ordem.getPeriodicityCode()));
            ordem.setActivities(activityDao.findByEquipamentoAndPeriodicaidade(ordem.getEquipament().getNumber(), ordem.getPeriodicityCode()));
            ordem.getEquipament().setHistoryEntries(historyEntryDAO.findByEquipamento(ordem.getEquipament().getNumber()));
            ordem.getEquipament().setNextHistoryEntry(historyEntryDAO.getNext(ordem.getEquipament().getNumber()));
        }
        return byTecnico;
    }

}
