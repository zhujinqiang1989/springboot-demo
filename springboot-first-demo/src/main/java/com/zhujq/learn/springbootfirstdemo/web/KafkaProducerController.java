/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: KafkaProducerController
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 19:57
 */

package com.zhujq.learn.springbootfirstdemo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * kafka 整合， producer
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
@RestController
@RequestMapping("kafka")
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @RequestMapping("send")
    public String send(String msg){
        kafkaTemplate.send("Hello-kafka", msg);
        return "success";
    }




}
