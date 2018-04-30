package com.king.feign.consumer.controller;

import com.king.feign.consumer.dto.User;
import com.king.feign.consumer.service.HelloService;
import com.king.feign.consumer.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    RefactorHelloService refactorHelloService;


    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\r\n");
        sb.append(helloService.hello("SLL")).append("\n\n");
        sb.append(helloService.hello("SLL",28)).append("\n\n");
        sb.append(helloService.hello(new User("SLL",28))).append("\n\n");
        return sb.toString();
    }

    @RequestMapping(value = "/feign-consumer3",method = RequestMethod.GET)
    public String helloConsumer3(){
        StringBuilder sb = new StringBuilder();

        sb.append(refactorHelloService.hello("MINI")).append("\n\n");
        sb.append(refactorHelloService.hello("MINI",28)).append("\n\n");
        sb.append(refactorHelloService.hello(new com.king.service.api.dto.User("SLL",28))).append("\n\n");
        return sb.toString();
    }

}
