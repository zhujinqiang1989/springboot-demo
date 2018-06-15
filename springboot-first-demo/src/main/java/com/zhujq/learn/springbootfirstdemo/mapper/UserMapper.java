/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserMapper
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 9:42
 */
package com.zhujq.learn.springbootfirstdemo.mapper;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 * user mybatis 映射类
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from tb_user where id = #{id}")
    User getUserById(Integer id);

    @Select("SELECT * FROM tb_user")
    public List<User> getUserList();

    @Insert("insert into tb_user(username, age, ctm) values(#{username}, #{age}, now())")
    public int add(User user);

    @Update("UPDATE tb_user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
    public int update(@Param("id") Integer id, @Param("user") User user);

    @Delete("DELETE from tb_user where id = #{id} ")
    public int delete(Integer id);







}
