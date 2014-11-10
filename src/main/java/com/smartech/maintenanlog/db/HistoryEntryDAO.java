package com.smartech.maintenanlog.db;

import com.smartech.maintenanlog.core.HistoryEntry;
import com.smartech.maintenanlog.core.mappers.HistoryEntryMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

/**
 * Created by jpedro on 10-11-2014.
 */
@RegisterMapper(HistoryEntryMapper.class)
public interface HistoryEntryDAO {
    @SqlQuery("select * from historicointervencoes where equipamento=:equipamento")
    List<HistoryEntry> findByEquipamento(@Bind("equipamento") String equipamento);

    @SqlQuery("select TOP 1 * from proximasintervencoes where " +
            " equipamento=:equipamento order by Data asc;")
    HistoryEntry getNext(@Bind("equipamento") String equipamento);
}
