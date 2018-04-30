package com.king.feign.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("HELLO-SERVICE")
public interface RefactorHelloService extends com.king.service.api.service.HelloService {


}
