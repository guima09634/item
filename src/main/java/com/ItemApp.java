package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 *spring boot程序启动入口
 *@date 2019/8/10
 *@author danielHua
 */
@SpringBootApplication
@EnableEurekaClient
public class ItemApp
{
    public static void main(String[] args) {
        SpringApplication.run(ItemApp.class, args);
    }
}
