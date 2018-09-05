package org.jim.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class HelloConsumerService {

    @Reference
    private HelloService helloService;

    public String sayHello(String name) {
        String msg = helloService.sayHello(name);
        return "Dubbo says: " + msg;
    }

}
