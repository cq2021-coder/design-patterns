package com.cq.jdbc;

/**
 * Oracle驱动程序
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/03
 */
public class OracleDriver implements CqDriver{
    @Override
    public void executeSql() {
        System.out.println("执行了Oracle数据库的sql");
    }
}
