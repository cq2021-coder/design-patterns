package com.cq.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义枝节点行为，存储子部件，在Component接口中实现与子部件有关的操作，比如add和remove
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public class Composite extends Component{

    private final List<Component> children = new ArrayList<>();

    /**
     * 复合
     *
     * @param name 名字
     */
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
        for (Component child : children) {
            child.display(depth + 2);
        }
    }
}
