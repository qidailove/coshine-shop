package com.qidaiai.coshineshopeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CoshineShopEurekaServerApplication {

    public static void main(String[] args) {
        System.out.println("商城注册中心服务端启动成功！");
        SpringApplication.run(CoshineShopEurekaServerApplication.class, args);
    }

}
