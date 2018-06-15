/**
 * Copyright (C), 2015-2018, NETEASE
 * FileName: KafkaConsumer
 * Author:   zhujingqiang_n8408
 * Date:     2018/6/15 19:58
 */

package com.zhujq.learn.springbootfirstdemo.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 *
 * kafka整合，consumer
 *
 * @author zhujingqiang_n8408
 * @create 2018/6/15
 * @since 1.0.0
 */
@Component
public class KafkaConsumer {
    @KafkaListener(topics = "Hello-kafka")
    public void listen (ConsumerRecord<?, ?> record) throws Exception {
        System.out.printf("topic = %s, offset = %d, value = %s \n", record.topic(), record.offset(), record.value());
    }

}
