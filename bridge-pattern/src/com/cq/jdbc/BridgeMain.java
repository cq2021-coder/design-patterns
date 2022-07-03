package com.cq.jdbc;

/**
 * 桥接模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/03
 */
public class BridgeMain {
    public static void main(String[] args) {
        DriverManagerBridge driverManagerBridge = new MyDriverBridge();
        driverManagerBridge.setDriver(new MysqlDriver());
        driverManagerBridge.execute();
        driverManagerBridge.setDriver(new OracleDriver());
        driverManagerBridge.execute();
    }
}
