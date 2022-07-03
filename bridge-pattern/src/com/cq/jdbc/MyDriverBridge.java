package com.cq.jdbc;

/**
 * 用户自定义功能
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/03
 */
public class MyDriverBridge extends DriverManagerBridge{
    @Override
    public void execute() {
        getDriver().executeSql();
    }
}
