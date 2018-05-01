package com.king.sleuth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class SleuthServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthServerApplication.class, args);
    }
}
