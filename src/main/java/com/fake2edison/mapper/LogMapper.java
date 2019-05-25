package com.fake2edison.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * Created by fake2edison on 2019/4/12.
 */
public interface LogMapper {
    public int insertLog(@Param("uid") int uid,@Param("operation")String operation,@Param("result") String result);
}
