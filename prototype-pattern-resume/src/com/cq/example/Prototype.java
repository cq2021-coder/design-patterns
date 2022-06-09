package com.cq.example;

/**
 * 原型类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public abstract class Prototype {
    private String id;

    /**
     * 抽象类关键就是这个clonePrototype方法
     *
     * @return {@link Prototype}
     */
    public abstract Prototype clonePrototype();

    public Prototype(String id) {
        this.id = id;
    }

    public Prototype() {
    }

    public String getId() {
        return id;
    }
}
