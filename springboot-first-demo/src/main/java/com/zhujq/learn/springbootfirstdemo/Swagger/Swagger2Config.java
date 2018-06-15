/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: Swagger2Config
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 11:20
 */

package com.zhujq.learn.springbootfirstdemo.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 *
 * swagger2 API 文件配置
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
//用@Configuration注解该类，等价于XML中配置beans；用@Bean标注方法等价于XML中配置bean。
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zhujq.learn.springbootfirstdemo.web"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("My Spring boot demo API 接口文档")
                .description("springboot利用swagger构建api文档")
                .termsOfServiceUrl("https://github.com/zhujinqiang1989")
                .version("1.0")
                .build();

    }


}
