package com.cq.impl;

/**
 * 懒汉模式（线程安全）
 * 对于懒汉模式来说，多线程调用getInstance()，getInstance()做了四件事情
 * 1.读取 instance 的内容
 * 2.判断 instance 是否为 null
 * 3.如果 instance 为null，就 new实例 （这就会修改 instance 的值）
 * 4.返回实例的地址
 * 由于懒汉模式造成了多个线程同时修改同一个变量这一情况，所以说懒汉模式是线程不安全的
 * 那么为了避免出现这种情况，则需要在获取实例方法处加上synchronized锁
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/02
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
