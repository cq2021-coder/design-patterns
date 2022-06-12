package com.cq;

/**
 * 建造者模式示例
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder01 concreteBuilder01 = new ConcreteBuilder01();
        ConcreteBuilder02 concreteBuilder02 = new ConcreteBuilder02();

        director.construct(concreteBuilder01).show();
        director.construct(concreteBuilder02).show();
        director.construct(() -> new Product().addComponentA("lambda的零件A").addComponentD("lambda的零件D")).show();
    }
}
