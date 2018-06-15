/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserServiceImpl
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 17:40
 */

package com.zhujq.learn.springbootfirstdemo.service.impl;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import com.zhujq.learn.springbootfirstdemo.dao.UserDao;
import com.zhujq.learn.springbootfirstdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 用户业务逻辑接口实现类
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int update(User user, Integer id) {
        return userDao.update(user, id);
    }

    @Override
    public int delete(Integer id) {
        return userDao.delete(id);
    }
}
