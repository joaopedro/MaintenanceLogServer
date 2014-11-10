package com.smartech.maintenanlog.core.mappers;

import com.smartech.maintenanlog.core.Part;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jpedro on 09-11-2014.
 */
public class PartMapper implements ResultSetMapper<Part> {
    @Override
    public Part map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Part(r.getLong("mat_ndx"), r.getString("mat_referencia"));
    }
}
