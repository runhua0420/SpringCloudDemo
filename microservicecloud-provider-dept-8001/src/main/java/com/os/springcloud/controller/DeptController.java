package com.os.springcloud.controller;


import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 控制器层
 */
@RestController
public class DeptController {

    //拿到业务逻辑层接口对象
    @Autowired
    private DeptService deptService;

    @RequestMapping("showAllDept")
//    @ResponseBody //把对象转成JSON字符串
    public List<Dept> showAllDept(){
        List<Dept> list = deptService.findAll();
        return list;
    }
}
