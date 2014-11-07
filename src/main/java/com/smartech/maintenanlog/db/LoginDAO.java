package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.Login;
import com.smartech.maintenanlog.core.mappers.LoginMapper;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 06-11-2014.
 */
@RegisterMapper(LoginMapper.class)
public interface LoginDAO {
    @SqlQuery("select login.*, tecnicos.tec_categoria from gestman.dbo.login left join gestman.dbo.tecnicos on login.login_tecnumero = tecnicos.tec_numero")
    List<Login> findAll();
}
