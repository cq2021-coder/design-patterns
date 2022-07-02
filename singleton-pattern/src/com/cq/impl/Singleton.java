package com.cq.impl;

/**
 * 静态内部类
 * 类的静态内部类在JVM中是唯一的，这很好地保证了单例对象的唯一性
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/02
 */
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton(){}

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
