package com.cq.example;

/**
 * 定义了RealSubject和Proxy的共用接口，这样Proxy就可以代理RealSubject
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public interface Subject {
    /**
     * 请求
     */
    void request();
}
