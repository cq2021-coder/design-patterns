package com.cq.jdbc;

/**
 * mysql驱动程序
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/03
 */
public class MysqlDriver implements CqDriver{
    @Override
    public void executeSql() {
        System.out.println("执行了MySQL数据库的sql");
    }
}
