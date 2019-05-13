package com.fake2edison.mapper;

import com.fake2edison.entity.Template;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by fake2edison on 2019/4/12.
 */
public interface TemplateMapper {
    public int insertTemplate(@Param("uid") int uid,@Param("statue") int statue,@Param("intime") Date intime,@Param("summary") String summary,@Param("title") String title,@Param("content") String content,@Param("templateimg") String templateimg);
    public List selectTemplateByUserId(@Param("uid")int id,@Param("page") int page);
    public List getAllTemplate(@Param("page") int page);
    public Template getTemplateById(@Param("id")int id);
}

//public interface UserMapper {
//    public User selectUserByLogin(@Param("account") String account,@Param("password") String password);
//    public int insertUserInRegiest(@Param("account") String account,@Param("telephone") String telephone,@Param("password") String password);
//    public User selectUserByTelephone(@Param("telephone") String telephone);
//}