package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.Equipamento;
import com.smartech.maintenanlog.core.Ordem;
import com.smartech.maintenanlog.core.mappers.EquipamentoMapper;
import com.smartech.maintenanlog.core.mappers.OrdemMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 06-11-2014.
 */
@RegisterMapper(EquipamentoMapper.class)
public interface EquipamentoDAO {
    @SqlQuery("select * from equipamentos")
    List<Equipamento> findAll();
}
