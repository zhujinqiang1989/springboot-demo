/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserDaoImpl
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 17:28
 */

package com.zhujq.learn.springbootfirstdemo.dao.impl;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import com.zhujq.learn.springbootfirstdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 *
 * 用户接口实现类
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUserById(Integer id) {
        String sqlStr = "select *  from tb_user where id = ?";
        List<User> list = jdbcTemplate.query(sqlStr,new  Object[]{id},  new BeanPropertyRowMapper(User.class));
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<User> getUserList() {
        String sqlStr = "select *  from tb_user";
        List<User> list = jdbcTemplate.query(sqlStr,new  Object[]{},  new BeanPropertyRowMapper(User.class));
        return list;
    }

    @Override
    public int add(User user) {
        int back = jdbcTemplate.update("insert into tb_user(username, age, ctm) values(?, ?, ?)",
                user.getUsername(),user.getAge(), new Date());
        return back;
    }

    @Override
    public int update(User user, Integer id) {
        int back =  jdbcTemplate.update("UPDATE tb_user SET username = ? , age = ? WHERE id=?",
                user.getUsername(),user.getAge(), id);
        return back;
    }

    @Override
    public int delete(Integer id) {
        return jdbcTemplate.update("DELETE from tb_user where id = ? ",id);
    }
}
