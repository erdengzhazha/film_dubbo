package com.cw.dubbo.consumer.quickStart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cw.dubbo.ServiceApi;
import org.springframework.stereotype.Component;

@Component
public class QuickStartConsumer {

    @Reference(url = "dubbo://127.0.0.1:20880")
    ServiceApi serviceApi;

    public String sendMassege(){
        return serviceApi.sendMessage("123");
    }
}
