package com.cq.example;

/**
 * 模板方法模式
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/11
 */
public class Main {
    public static void main(String[] args) {
        AbstractClass abstractClass;

        abstractClass = new ConcreteClassA();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassB();
        abstractClass.templateMethod();
    }
}
