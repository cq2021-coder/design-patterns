package com.cq.example;

/**
 * 外观模式启动类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Main {
    public static void main(String[] args) {
        //客户端完全不知道四个子系统类的存在
        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
    }
}
