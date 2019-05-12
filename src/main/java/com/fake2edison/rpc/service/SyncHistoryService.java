package com.fake2edison.rpc.service;

import com.fake2edison.entity.SyncHistory;
import com.fake2edison.mapper.SyncHistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/5/11.
 */
@Service
public class SyncHistoryService {
    @Autowired
    private SyncHistoryMapper syncHistoryMapper;

    public int insertSyncHistory(int uid, String wid, int contentid,String wname,String title){
        int count = syncHistoryMapper.insertSyncHistory(uid,wid,contentid,wname,title);
        return count;
    }

    public ArrayList<SyncHistory> selectSyncHistoryByUserId(int id){
        ArrayList<SyncHistory> syncHistoryArrayList = syncHistoryMapper.selectSyncHistoryByUserId(id);
        return syncHistoryArrayList;

    }

    public ArrayList<SyncHistory> selectSyncRecord(){
        ArrayList<SyncHistory> syncHistoryArrayList = syncHistoryMapper.selectSyncHistory();
        return syncHistoryArrayList;
    }
}
