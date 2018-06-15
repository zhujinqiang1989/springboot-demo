package com.zhujq.learn.springbootfirstdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *
 * springboot 启动类
 * @since: 1.0.0
 * @Author: zhujingqiang_n8408
 * @Date: 2018/6/14 10:59
 */


// @SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
@SpringBootApplication
@MapperScan("com.zhujq.learn.springbootfirstdemo.mapper")
@EnableSwagger2
public class SpringbootFirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstDemoApplication.class, args);
	}
			}
