package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.Part;
import com.smartech.maintenanlog.core.mappers.PartMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 09-11-2014.
 */
@RegisterMapper(PartMapper.class)
public interface PartDAO {
    @SqlQuery("select mat.* from materiais mat, listasmateriais listmat " +
            "where listmat.lstmat_mat_ndx=mat.mat_ndx " +
            "and lstmat_equ_numero = :equipamento and lstmat_per = :periodicidade")
    List<Part> findByEquipamentoAndPeriodicaidade(@Bind("equipamento") String equipamento, @Bind("periodicidade") String periodicidade);
}
