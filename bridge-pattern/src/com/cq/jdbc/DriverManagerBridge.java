package com.cq.jdbc;

/**
 * 用于实现桥接模式
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/03
 */
public abstract class DriverManagerBridge {
    private CqDriver driver;

    public void execute() {
        this.driver.executeSql();
    }

    public CqDriver getDriver() {
        return driver;
    }

    public void setDriver(CqDriver driver) {
        this.driver = driver;
    }
}
