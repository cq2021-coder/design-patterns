package com.cq.example;

/**
 * 继承Decorator
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class ConcreteDecoratorA extends Decorator{

    /**
     * 特有属性，区别于B
     */
    private String addState;

    /**
     * 设置Component，处理Component的实例化
     */
    @Override
    public void operation() {
        super.operation();
        addState = "装饰对象A";
        System.out.println("具体装饰对象A的操作");
    }
}
