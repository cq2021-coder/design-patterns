package com.cq.impl;

import com.cq.abstract_interface.DeptInterface;
import com.cq.entity.Department;

/**
 * mysql用户
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public class MysqlDept implements DeptInterface {

    @Override
    public void insert(Department user) {
        System.out.println("向MySQL数据库中插入一条department表数据");
    }

    @Override
    public Department getDept(int id) {
        System.out.println("向MySQL数据库查询一条department表数据");
        return null;
    }
}
