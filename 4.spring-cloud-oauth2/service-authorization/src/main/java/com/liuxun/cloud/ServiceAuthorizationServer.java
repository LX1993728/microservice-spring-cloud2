package com.liuxun.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer // 开启Resource Server，程序需要堆外暴露获取Token的API接口和验证Token的API接口，因此该程序也是一资源服务
@EnableEurekaClient // 开启Eureka Client客户端的功能
@SpringBootApplication
public class ServiceAuthorizationServer {
    public static void main(String[] args){
        SpringApplication.run(ServiceAuthorizationServer.class,args);
    }
}
