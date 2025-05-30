package com.alibaba.cloud.ai.agent;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.alibaba.cloud.ai" })
public class GraphApplication {

    public static void main(String[] args) {

        SpringApplication.run(GraphApplication.class, args);
    }
}
