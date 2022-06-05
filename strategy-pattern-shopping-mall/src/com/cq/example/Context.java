package com.cq.example;

/**
 * 上下文
 * 用一个ConcreteStrategy来配置，维护一个对Strategy的引用
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class Context {
    private final Strategy strategy;

    /**
     * 初始化时引入具体的策略对象
     *
     * @param strategy 策略
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
