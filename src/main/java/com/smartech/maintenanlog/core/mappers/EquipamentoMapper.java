package com.smartech.maintenanlog.core.mappers;

import com.smartech.maintenanlog.core.Equipamento;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jpedro on 07-11-2014.
 */
public class EquipamentoMapper implements ResultSetMapper<Equipamento> {
    @Override
    public Equipamento map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Equipamento(r.getLong("equ_ndx"), r.getString("equ_numero"), r.getString("equ_designacao"), r.getString("equ_localizacao"));
    }
}
