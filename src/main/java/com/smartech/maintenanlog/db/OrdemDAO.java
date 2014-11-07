package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.Ordem;
import com.smartech.maintenanlog.core.mappers.OrdemMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 06-11-2014.
 */
@RegisterMapper(OrdemMapper.class)
public interface OrdemDAO {
    @SqlQuery("select * from ordens, equipamentos where ord_equipamento=equ_numero and ord_data is not null and ord_estado='agd'")
    List<Ordem> findAll();

    @SqlQuery("select * from ordens, equipamentos where ord_equipamento=equ_numero and convert(varchar(10),ord_data,102)=convert(varchar(10),getdate(),102)" +
            " and ord_estado='agd' and ord_tecnumero= :tecnico")
    List<Ordem> findByTecnicno(@Bind("tecnico") String tecnico);
}
