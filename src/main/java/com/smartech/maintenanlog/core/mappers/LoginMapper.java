package com.smartech.maintenanlog.core.mappers;

import com.smartech.maintenanlog.core.Login;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by jpedro on 07-11-2014.
 */
public class LoginMapper implements ResultSetMapper<Login>
{
    public Login map(int index, ResultSet r, StatementContext ctx) throws SQLException
    {
        return new Login(r.getLong("login_ndx"), r.getString("login_usr").trim(), r.getString("login_pwd").trim()
                , r.getString("login_perfil"), r.getString("login_nome"), r.getString("login_apelido"), r.getString("login_tecnumero")
                , r.getString("tec_categoria"));
    }
}
