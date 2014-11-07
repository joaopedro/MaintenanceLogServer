package com.smartech.maintenanlog.core.mappers;

import com.smartech.maintenanlog.core.Equipamento;
import com.smartech.maintenanlog.core.Ordem;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Created by jpedro on 07-11-2014.
 */
public class OrdemMapper  implements ResultSetMapper<Ordem> {
    @Override
    public Ordem map(int i, ResultSet r, StatementContext statementContext) throws SQLException {
        Calendar ordemDate = Calendar.getInstance();
        ordemDate.setTime(r.getDate("ord_data"));

        Ordem ordem = new Ordem(r.getLong("ord_ndx"), r.getString("ord_numero"), r.getString("ord_periodabreviatura"),
                r.getString("ord_tipo"), ordemDate, r.getString("ord_estado"), r.getString("ord_tecnumero"),
                r.getString("ord_observacoes"));
        ordem.setEquipament(new EquipamentoMapper().map(i,r,statementContext));

        return ordem;
    }
}
