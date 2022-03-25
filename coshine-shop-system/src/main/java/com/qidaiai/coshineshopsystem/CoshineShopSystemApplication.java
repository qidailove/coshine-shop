package com.qidaiai.coshineshopsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CoshineShopSystemApplication {

    public static void main(String[] args) {
        System.out.println("商城系统模块启动成功！");
        SpringApplication.run(CoshineShopSystemApplication.class, args);
    }

}
