package com.cq;

/**
 * 具体构造者类1
 * 通常情况下，如果搭建框架，那么此类应由开发者编写
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class ConcreteBuilder01 implements Builder {

    @Override
    public Product build() {
        return new Product()
                .addComponentA("实现类1的零件A")
                .addComponentB("实现类1的零件B")
                .addComponentC("实现类1的零件C")
                .addComponentD("实现类1的零件D");
    }
}
