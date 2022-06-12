package com.cq;

/**
 * 具体构造者类2
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class ConcreteBuilder02 implements Builder {

    @Override
    public Product build() {
        return new Product()
                .addComponentA("实现类2的零件A")
                .addComponentB("实现类2的零件B")
                .addComponentC("实现类2的零件C")
                .addComponentD("实现类2的零件D");
    }
}
