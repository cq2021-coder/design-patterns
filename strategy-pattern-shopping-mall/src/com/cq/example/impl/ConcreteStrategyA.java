package com.cq.example.impl;

import com.cq.example.Strategy;

/**
 * 具体算法A
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("算法A实现");
    }
}
