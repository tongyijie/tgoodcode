package com.tgood.oss.base.oneService.model;

/**
 * Created by Administrator on 2016/11/15 0015.
 */
public class User {
    private String userId ;
    private String userName;
    private int age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
