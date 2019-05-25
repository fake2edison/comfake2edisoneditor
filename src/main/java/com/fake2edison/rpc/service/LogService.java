package com.fake2edison.rpc.service;

import com.fake2edison.mapper.LogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fake2edison on 2019/5/22.
 */
@Service
public class LogService {
    @Autowired
    private LogMapper logMapper;

    public int insertLog(int uid, String operation, String result){
        int count = logMapper.insertLog(uid,operation,result);
        return count;
    }
}
