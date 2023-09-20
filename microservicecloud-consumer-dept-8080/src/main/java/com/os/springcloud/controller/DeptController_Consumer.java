package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 消费者项目的控制器
 */
//@Controller+@ResponseBody
@RestController
public class DeptController_Consumer {

    /**
     此处需要一个调用微服务的接口对象（模板）
     RestTemplate就是调用提供者功能的一个接口对象
     *restTemplate相当于拿到提供者中增删改查方法一个对象
     */
    @Resource
    private RestTemplate restTemplate;

    //查询方法（调用提供者项目中查询功能）
    @RequestMapping("showAllDeptByConsumer")
    public List<Dept> showAllDeptByConsumer(){
        List<Dept> list = restTemplate.getForObject("http://localhost:8001/showAllDept", List.class);
        return  list;
    }
}

