package com.cq.example;

/**
 * 原型模型启动类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype p1 = new ConcretePrototype("I");
        ConcretePrototype c1 = (ConcretePrototype) p1.clonePrototype();
        System.out.println("复制的对象：" + c1.getId());
    }
}
