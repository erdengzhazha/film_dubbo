package com.cw.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.cw.dubbo.consumer.quickStart.QuickStartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext app =  SpringApplication.run(ConsumerApplication.class, args);
        QuickStartConsumer q = (QuickStartConsumer)app.getBean("quickStartConsumer");
        System.out.println(q.sendMassege());
    }

}
