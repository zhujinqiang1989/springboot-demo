/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: YmltestConfig
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 11:47
 */

package com.zhujq.learn.springbootfirstdemo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
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
@ConfigurationProperties(prefix = "test2.user")
@PropertySource("classpath:test.yml")
public class YmltestConfig {


    @Value("${username}")
    private  String  username;


    @Value("${age}")
    private  String  age;

    @Value("${toString}")
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
        return "YmltestConfig{" +
                "username='" + username + '\'' +
                ", age='" + age + '\'' +
                ", toString='" + toString + '\'' +
                '}';
    }
}
