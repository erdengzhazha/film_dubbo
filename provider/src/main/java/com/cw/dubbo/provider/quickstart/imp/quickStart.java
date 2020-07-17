package com.cw.dubbo.provider.quickstart.imp;

import com.alibaba.dubbo.config.annotation.Service;

import com.cw.dubbo.ServiceApi;
import org.springframework.stereotype.Component;


@Service(interfaceClass = ServiceApi.class)
@Component
public class quickStart implements ServiceApi {
    @Override
    public String sendMessage(String message) {
        return "send a message="+message;
    }
}
