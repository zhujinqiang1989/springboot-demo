/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: User
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 17:17
 */

package com.zhujq.learn.springbootfirstdemo.bean;

import java.util.Date;

/**
 *
 * 用户实体类
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

    public User(){

    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", ctm=" + ctm +
                '}';
    }
}
