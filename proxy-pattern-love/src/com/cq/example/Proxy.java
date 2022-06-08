package com.cq.example;

/**
 * 保存一个引用让代理可以访问到实体
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
