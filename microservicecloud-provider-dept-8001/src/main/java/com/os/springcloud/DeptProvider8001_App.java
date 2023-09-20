package com.os.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 当前微服务项目的启动类
 */
@SpringBootApplication
@EnableEurekaClient //通过这个注解开启Eureka客户端的功能
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
