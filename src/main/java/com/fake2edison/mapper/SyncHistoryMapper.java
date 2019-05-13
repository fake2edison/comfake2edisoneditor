package com.fake2edison.mapper;

import com.fake2edison.entity.SyncHistory;
import com.fake2edison.entity.SyncMap;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fake2edison on 2019/5/11.
 */
public interface SyncHistoryMapper {

    public ArrayList<SyncHistory> selectSyncHistoryByUserId(@Param("uid") int id);

    public int insertSyncHistory(@Param("uid")int uid, @Param("wid") String wid,@Param("contentid") int contentid,@Param("wname") String wname, @Param("title") String title);

    public ArrayList<SyncHistory> selectSyncHistory();

    public ArrayList<SyncMap> countSync();
}
