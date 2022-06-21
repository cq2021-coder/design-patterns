package com.cq.example;

/**
 * 适配器模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
