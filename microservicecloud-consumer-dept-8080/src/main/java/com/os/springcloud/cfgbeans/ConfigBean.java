package com.os.springcloud.cfgbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate restTemplate = new RestTemplate();
 * 当前类就相当于“业务逻辑层”
 */

@Configuration
public class ConfigBean {

    /**
     * 此处需要一个方法，专门用来给restTemplate赋值
     */
    @Bean
    public RestTemplate getRestTemplate(){
        //创建对象
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }



}
