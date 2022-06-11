package com.cq.example;


/**
 * 抽象类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/11
 */
public abstract class AbstractClass {
    /**
     * 抽象行为1，在子类中实现
     */
    public abstract void primitiveOperation1();

    /**
     * 抽象行为2，在子类中实现
     */
    public abstract void primitiveOperation2();

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println();
    }
}
