package com.cq.impl;

/**
 * 双重校验锁
 * 在懒汉模式的基础上进一步优化
 * 给静态对象的定义加上volatile锁来保证初始化时对象的唯一性
 * 在获取对象时通过synchronized(Singleton.class)给单例类加锁来保证操作的唯一性
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/02
 */
public class Lock2Singleton {
    /**
     * 1、对象锁，避免编译器读取保存在寄存器的对象（避免指令重排优化）
     */
    private volatile static Lock2Singleton singleton;
    private Lock2Singleton(){}

    public static Lock2Singleton getInstance() {
        if (singleton == null) {
            //synchronized方法锁
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Lock2Singleton();
                }
            }
        }
        return singleton;
    }
}
