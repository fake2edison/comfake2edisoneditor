package com.fake2edison.mapper;

import com.fake2edison.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/10.
 */
public interface UserMapper {
    public User selectUserByLogin(@Param("account") String account,@Param("password") String password);
    public int insertUserInRegiest(@Param("account") String account,@Param("telephone") String telephone,@Param("password") String password);
    public User selectUserByTelephone(@Param("telephone") String telephone);
    public ArrayList<User> selectUserByPage(@Param("pre_page") int pre_page, @Param("last_page")int last_page);
    public int addAdminByUserId(@Param("uid")int uid);
    public int removeAdminByUserId(@Param("uid")int uid);
    public int countUser();
}
