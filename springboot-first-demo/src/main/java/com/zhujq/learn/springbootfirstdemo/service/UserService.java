/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserService
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 17:39
 */
package com.zhujq.learn.springbootfirstdemo.service;

import com.zhujq.learn.springbootfirstdemo.bean.User;

import java.util.List;

/**
 *
 * 用户业务逻辑接口
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
public interface UserService {
    User getUserById(Integer id);
    public List<User> getUserList();
    public  int add(User user);
    public  int update(User user, Integer id);
    public  int delete(Integer id);

}
