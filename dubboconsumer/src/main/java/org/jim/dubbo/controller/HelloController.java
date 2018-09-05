package org.jim.dubbo.controller;

import org.jim.dubbo.service.HelloConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloConsumerService helloConsumerService;

    @RequestMapping("/hello")
    public Object hello() {
        return helloConsumerService.sayHello("There");
    }

}
