package com.cq;

/**
 * 状态模式的入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/19
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
