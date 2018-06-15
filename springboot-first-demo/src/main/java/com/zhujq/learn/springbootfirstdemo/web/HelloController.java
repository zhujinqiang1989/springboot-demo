/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: HelloController
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/14 10:48
 */

package com.zhujq.learn.springbootfirstdemo.web;

import com.zhujq.learn.springbootfirstdemo.bean.UserTestConfig;
import com.zhujq.learn.springbootfirstdemo.bean.YmltestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * springboot demo hello world
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/14
 * @since 1.0.0
 */
@RestController
public class HelloController  {

    @Autowired
    private UserTestConfig userTestConfig;

    @Autowired
    private YmltestConfig ymltestConfig;


    @RequestMapping(value = "sayhello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello springboot, I'm zhujingqiang. ";
    }


    @RequestMapping(value = "testyml", method = RequestMethod.GET)
    public String testyml(){

        return userTestConfig.getToString();
    }

    @RequestMapping(value = "testyml2", method = RequestMethod.GET)
    public String testyml2(){
        System.out.println(ymltestConfig.getToString());
        return ymltestConfig.getToString();
    }




}
