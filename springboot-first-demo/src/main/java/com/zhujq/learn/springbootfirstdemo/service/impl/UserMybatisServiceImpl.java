/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserMybatisServiceImpl
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 9:47
 */

package com.zhujq.learn.springbootfirstdemo.service.impl;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import com.zhujq.learn.springbootfirstdemo.mapper.UserMapper;
import com.zhujq.learn.springbootfirstdemo.service.UserMybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 用户业务逻辑实现类（mybatis支持）
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
@Service
public class UserMybatisServiceImpl implements UserMybatisService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int update(Integer id, User user) {
        return userMapper.update(id,user);
    }

    @Override
    public int delete(Integer id) {
        return userMapper.delete(id);
    }
}
