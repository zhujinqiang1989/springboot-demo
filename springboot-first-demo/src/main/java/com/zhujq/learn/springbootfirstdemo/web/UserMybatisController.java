/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserMybatisController
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 9:56
 */

package com.zhujq.learn.springbootfirstdemo.web;

import com.zhujq.learn.springbootfirstdemo.bean.JsonResult;
import com.zhujq.learn.springbootfirstdemo.bean.User;
import com.zhujq.learn.springbootfirstdemo.service.UserMybatisService;
import com.zhujq.learn.springbootfirstdemo.service.UserMybatisXmlService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * 用户API接口（mybatis支持）
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
@RestController
@RequestMapping("mybatis")
public class UserMybatisController {

    @Autowired
    //private UserMybatisService userMybatisService;
    private UserMybatisXmlService userMybatisService;

    private final static Logger loger = Logger.getLogger(UserMybatisController.class);


    /**
     * 查询用户
     * @return
     */
    @ApiOperation(value = "获取用户详细信息", notes = "根据id查询用户表获取用户信息", httpMethod = "GET")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, paramType = "query", dataType = "Integer")
    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserById(@RequestParam(value = "id",required = true) Integer id){
        loger.info("getUserById() - id="+ id + ", start. ");
        JsonResult r = new JsonResult();
        try {
            User user = userMybatisService.getUserById(id);
            loger.info("getUserById() - id="+ id + ", user="+ user);
            r.setResult(user);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 查询用户列表
     * @return
     */
    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ResponseEntity<JsonResult> getUserList (){
        JsonResult r = new JsonResult();
        try {
            List<User> users = userMybatisService.getUserList();
            r.setResult(users);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    @RequestMapping(value = "adduser", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> add (@RequestBody User user){
        JsonResult r = new JsonResult();
        try {
            int orderId = userMybatisService.add(user);
            if (orderId < 0) {
                r.setResult(orderId);
                r.setStatus("fail");
            } else {
                r.setResult(orderId);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "deluser", method = RequestMethod.DELETE)
    public ResponseEntity<JsonResult> delete (@RequestParam(value = "id",required = true) Integer id){
        JsonResult r = new JsonResult();
        try {
            int ret = userMybatisService.delete(id);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus("fail");
            } else {
                r.setResult(ret);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

    /**
     * 根据id修改用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.PUT)
    public ResponseEntity<JsonResult> update (@RequestParam(value = "id") Integer id, @RequestBody User user){
        JsonResult r = new JsonResult();
        try {
            int ret = userMybatisService.update(id, user);
            if (ret < 0) {
                r.setResult(ret);
                r.setStatus("fail");
            } else {
                r.setResult(ret);
                r.setStatus("ok");
            }
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");

            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }







}
