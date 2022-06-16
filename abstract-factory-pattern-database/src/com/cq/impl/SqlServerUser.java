package com.cq.impl;

import com.cq.abstract_interface.UserInterface;
import com.cq.entity.User;

/**
 * sql server用户
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public class SqlServerUser implements UserInterface {

    @Override
    public void insert(User user) {
        System.out.println("向SqlServer数据库中插入一条User表数据");
    }

    @Override
    public User getUser(int id) {
        System.out.println("向SqlServer数据库查询一条User表数据");
        return null;
    }
}
