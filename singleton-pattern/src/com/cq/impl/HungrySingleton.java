package com.cq.impl;

/**
 * 饥饿模式
 * 本身就是线程安全的，因为在类加载器加载后就已经创建了这个对象
 * 而获取获取实例的方法只有读，没有写，则不会出现线程安全问题
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/02
 */
public class HungrySingleton {
    private static final HungrySingleton SINGLETON = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
}
