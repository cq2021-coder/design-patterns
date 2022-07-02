package com.cq;

import com.cq.impl.HungrySingleton;
import com.cq.impl.LazySingleton;
import com.cq.impl.Lock2Singleton;
import com.cq.impl.Singleton;

/**
 * 单例模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/02
 */
public class SingletonMain {
    public static void main(String[] args) {
        new Thread(()-> System.out.println(LazySingleton.getInstance())).start();
        new Thread(()-> System.out.println(LazySingleton.getInstance())).start();
        new Thread(()-> System.out.println(LazySingleton.getInstance())).start();

        new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();
        new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();
        new Thread(() -> System.out.println(HungrySingleton.getInstance())).start();

        new Thread(() -> System.out.println(Singleton.getInstance())).start();
        new Thread(() -> System.out.println(Singleton.getInstance())).start();
        new Thread(() -> System.out.println(Singleton.getInstance())).start();

        new Thread(() -> System.out.println(Lock2Singleton.getInstance())).start();
        new Thread(() -> System.out.println(Lock2Singleton.getInstance())).start();
        new Thread(() -> System.out.println(Lock2Singleton.getInstance())).start();
    }
}
