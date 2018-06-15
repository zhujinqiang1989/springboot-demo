/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserTestConfig
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 11:32
 */

package com.zhujq.learn.springbootfirstdemo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * yml测试配置类
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
@Component
@ConfigurationProperties(prefix = "test.user")
public class UserTestConfig {

    private  String  username;


    private  String  age;


    private  String  toString;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getToString() {
        return toString;
    }

    public void setToString(String toString) {
        this.toString = toString;
    }


    @Override
    public String toString() {
        return "UserTestConfig{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", toString='" + toString + '\'' +
                '}';
    }
}
