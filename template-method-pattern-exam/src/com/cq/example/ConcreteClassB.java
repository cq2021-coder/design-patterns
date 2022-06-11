package com.cq.example;

/**
 * 具体实现类B
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/11
 */
public class ConcreteClassB extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
