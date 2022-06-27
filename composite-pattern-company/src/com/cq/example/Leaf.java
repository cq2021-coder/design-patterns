package com.cq.example;

/**
 * 叶对象节点
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("不能添加叶子");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不能删除叶子");
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
    }
}
