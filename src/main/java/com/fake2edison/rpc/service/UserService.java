package com.fake2edison.rpc.service;

import com.fake2edison.entity.User;
import com.fake2edison.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;

/**
 * Created by fake2edison on 2019/4/10.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User userLogin(String account, String password){
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        User user = userMapper.selectUserByLogin(account,md5Password);
        return user;
    }

    public String userRegiest(String username,String telephone, String password){
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        int result = userMapper.insertUserInRegiest(username,telephone,md5Password);
        return result+"";
    }

    public boolean userIsRegiest(String telephone){
        User user = userMapper.selectUserByTelephone(telephone);
        boolean flag = false;
        if(user != null){
            flag = true;
        }
        return flag;
    }
    public ArrayList<User> selectUserByPage(int pre_page,int last_page){
        ArrayList<User> userArrayList = new ArrayList<User>();
        userArrayList = userMapper.selectUserByPage(pre_page,last_page);
        return userArrayList;
    }
    public int addAdminByUid(int uid){
        int count = userMapper.addAdminByUserId(uid);
        return count;
    }
    public int removeAdminByUid(int uid){
        int count = userMapper.removeAdminByUserId(uid);
        return count;
    }
    public int countUser(){
        int count = userMapper.countUser();
        return count;
    }
}
