package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.Ordem;
import com.smartech.maintenanlog.core.mappers.OrdemMapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 06-11-2014.
 */
@RegisterMapper(OrdemMapper.class)
public interface OrdemDAO {
    @SqlQuery("select * from ordens where ord_data is not null and ord_estado='agd'")
    List<Ordem> findAll();
}
