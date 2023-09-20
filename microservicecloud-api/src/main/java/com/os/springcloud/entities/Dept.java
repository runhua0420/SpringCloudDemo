package com.os.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 实体层
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
public class Dept {

    private Long 	deptno; // 主键（部门编号）
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库


}
