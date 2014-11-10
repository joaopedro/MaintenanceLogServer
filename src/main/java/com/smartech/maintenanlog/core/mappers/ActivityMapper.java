package com.smartech.maintenanlog.core.mappers;

import com.smartech.maintenanlog.core.Activity;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jpedro on 09-11-2014.
 */
public class ActivityMapper implements ResultSetMapper<Activity> {
    @Override
    public Activity map(int index, ResultSet r, StatementContext ctx) throws SQLException {
        return new Activity(r.getLong("act_ndx"), r.getString("act_detalhe"), r.getString("act_tipo"));
    }
}
