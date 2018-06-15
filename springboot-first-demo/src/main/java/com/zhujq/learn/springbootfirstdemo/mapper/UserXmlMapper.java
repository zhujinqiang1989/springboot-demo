/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: UserXmlMapper
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 10:55
 */

package com.zhujq.learn.springbootfirstdemo.mapper;

import com.zhujq.learn.springbootfirstdemo.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * 支持mybatis xml 配置形式的接口
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
@Repository
public interface UserXmlMapper {
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(@Param("id") Integer id, @Param("user") User user);

    public int delete(Integer id);

}
