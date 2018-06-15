/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserMybatisService
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 9:46
 */
package com.zhujq.learn.springbootfirstdemo.service;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * 用户逻辑（mybatis支持）
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
public interface UserMybatisXmlService {
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(@Param("id") Integer id, @Param("user") User user);

    public int delete(Integer id);
}
