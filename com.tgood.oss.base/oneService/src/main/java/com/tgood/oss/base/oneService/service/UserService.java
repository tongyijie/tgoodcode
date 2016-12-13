package com.tgood.oss.base.oneService.service;

import com.mysql.jdbc.StringUtils;
import com.tgood.oss.base.oneService.dao.UserDao;
import com.tgood.oss.base.oneService.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
@Component()
public class UserService {

    @Autowired
    UserDao userDao;

    /**
     * get all user
     * @return
     */
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
    
    /**
     * 添加user
     * @param user
     * @throws Exception
     */
    public void addUser(User user) throws Exception{
    	if(null == user){
    		throw new Exception("add null user");
    	}
    	
    	if(StringUtils.isNullOrEmpty(user.getUserId())){
    		user.setUserId(UUID.randomUUID().toString());
    	}
    	
    	userDao.addUser(user);
    }
    
    /**
     * 查询相同名字的所有user
     * @param userName
     * @return
     */
    public List<User> getUsersByName(String userName){
    	if(StringUtils.isNullOrEmpty(userName)){
    		return new ArrayList<User>();
    	}
    	return userDao.getUsersByName(userName);
    }
}
