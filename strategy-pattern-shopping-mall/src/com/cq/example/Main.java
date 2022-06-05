package com.cq.example;

import com.cq.example.impl.ConcreteStrategyA;
import com.cq.example.impl.ConcreteStrategyB;
import com.cq.example.impl.ConcreteStrategyC;

/**
 * 策略模式启动类
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class Main {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
