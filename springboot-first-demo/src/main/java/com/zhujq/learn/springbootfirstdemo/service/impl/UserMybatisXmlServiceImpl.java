/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserMybatisServiceImpl
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 9:47
 */

package com.zhujq.learn.springbootfirstdemo.service.impl;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import com.zhujq.learn.springbootfirstdemo.mapper.UserMapper;
import com.zhujq.learn.springbootfirstdemo.mapper.UserXmlMapper;
import com.zhujq.learn.springbootfirstdemo.service.UserMybatisService;
import com.zhujq.learn.springbootfirstdemo.service.UserMybatisXmlService;
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
public class UserMybatisXmlServiceImpl implements UserMybatisXmlService {

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Override
    public User getUserById(Integer id) {
        return userXmlMapper.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
        return userXmlMapper.getUserList();
    }

    @Override
    public int add(User user) {
        return userXmlMapper.add(user);
    }

    @Override
    public int update(Integer id, User user) {
        return userXmlMapper.update(id,user);
    }

    @Override
    public int delete(Integer id) {
        return userXmlMapper.delete(id);
    }
}
