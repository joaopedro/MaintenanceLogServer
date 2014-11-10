package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.Activity;
import com.smartech.maintenanlog.core.mappers.ActivityMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 09-11-2014.
 */
@RegisterMapper(ActivityMapper.class)
public interface ActivityDAO {
    @SqlQuery("select act.* from equipamentosactividades eqact, listasactividades listact, actividades act " +
            "where eqact.equact_lstact_numero = listact.lstact_numero " +
            "and listact.lstact_act_ndx = act.act_ndx " +
            "and equact_equ_numero = :equipamento and equact_act_per=:periodicidade;")
    List<Activity> findByEquipamentoAndPeriodicaidade(@Bind("equipamento") String equipamento, @Bind("periodicidade") String periodicidade);
}
