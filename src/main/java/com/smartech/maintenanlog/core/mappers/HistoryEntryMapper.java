package com.smartech.maintenanlog.core.mappers;

import com.smartech.maintenanlog.core.HistoryEntry;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jpedro on 10-11-2014.
 */
public class HistoryEntryMapper  implements ResultSetMapper<HistoryEntry> {
    @Override
    public HistoryEntry map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new HistoryEntry(r.getLong("Equipamento"), r.getString("Data"), r.getString("Tecnico"));
    }
}
