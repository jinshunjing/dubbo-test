package org.jim.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.jim.dubbo.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello " + name + "!";
    }

}
