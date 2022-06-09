package com.cq.example;

/**
 * 具体原型类
 * 实现Cloneable接口，就可以进行浅克隆
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class ConcretePrototype extends Prototype implements Cloneable {

    public ConcretePrototype(String id) {
        super(id);
    }

    @Override
    public Prototype clonePrototype() {
        try {
            return (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
