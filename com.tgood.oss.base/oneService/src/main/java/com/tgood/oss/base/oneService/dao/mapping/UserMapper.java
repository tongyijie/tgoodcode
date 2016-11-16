package com.tgood.oss.base.oneService.dao.mapping;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tgood.oss.base.oneService.model.User;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
@Component
public interface UserMapper {
    List<User> getAllUsers();
    List<User> getUsersByName(String userName);
    void deleteById(String userId);
    void addUser(User user);
    void updateById(User user);
}
