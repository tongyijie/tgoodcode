package com.tgood.oss.base.oneService.dao;

import com.tgood.oss.base.oneService.dao.mapping.UserMapper;
import com.tgood.oss.base.oneService.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
@Component
public class UserDao {
    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }
    
    public void addUser(User user){
    	userMapper.addUser(user);
    }
    
    public List<User> getUsersByName(String userName){
    	return userMapper.getUsersByName(userName);
    }
}
