package com.cq.example;

/**
 * 代理模式启动类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Main {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        //实际此处是RealSubject处理的请求，虽然Main方法不认识RealSubject，但是Main认识Proxy，Proxy认识RealSubject。
        proxy.request();
    }
}
