package com.smalldogg.cdctest.config;

import org.springframework.kafka.annotation.KafkaListener;

public class Consumer {
    @KafkaListener(topics = "dbserver1.debezium.ad_clicks")
    public void listenGroupFoo(String message) {
        System.out.println("message : " + message);
    }
}
