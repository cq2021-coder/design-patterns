package com.cq.example;

/**
 * 组合中的对象声明接口，在适当情况下，实现所有类的共有接口的默认行为，声明一个接口用于访问和管理Component的子部件
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/27
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 添加树枝
     *
     * @param component 组件
     */
    public abstract void add(Component component);

    /**
     * 删除树枝
     *
     * @param component 组件
     */
    public abstract void remove(Component component);

    /**
     * 显示
     *
     * @param depth 深度
     */
    public abstract void display(int depth);

}
