package com.cq.example;

/**
 * 装饰模式启动类
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();

        /*
          大体流程：
          1、初始化对象ConcreteComponent
          2、用ConcreteDecoratorA包装ConcreteComponent
          3、用ConcreteDecoratorB包装ConcreteDecoratorA
         */
        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorB.setComponent(concreteDecoratorA);
        System.out.println("===============================未装饰ConcreteComponent===============================");
        concreteComponent.operation();
        System.out.println("======================用装饰ConcreteDecoratorAConcreteComponent======================");
        concreteDecoratorA.operation();
        System.out.println("======================用ConcreteDecoratorB装饰ConcreteDecoratorA======================");
        concreteDecoratorB.operation();
    }
}
