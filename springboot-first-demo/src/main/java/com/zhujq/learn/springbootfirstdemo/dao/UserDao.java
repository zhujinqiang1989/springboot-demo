package com.zhujq.learn.springbootfirstdemo.dao;

import com.zhujq.learn.springbootfirstdemo.bean.User;

import java.util.List;

public interface UserDao {
    User getUserById(Integer id);
    public List<User> getUserList();
    public  int add(User user);
    public  int update(User user, Integer id);
    public  int delete(Integer id);
}
