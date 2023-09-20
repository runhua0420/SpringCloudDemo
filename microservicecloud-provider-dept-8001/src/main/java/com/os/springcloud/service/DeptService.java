package com.os.springcloud.service;

import com.os.springcloud.entities.Dept;

import java.util.List;

/**
 * 业务逻辑层
 */
public interface DeptService {

    //查询
    List<Dept> findAll();

}
