package com.cq.example;

/**
 * 具体实现类A
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/11
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类A方法2实现");
    }
}
