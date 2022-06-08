package com.cq.example;

/**
 * 定义了Proxy的实体
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("真正的请求");
    }
}
