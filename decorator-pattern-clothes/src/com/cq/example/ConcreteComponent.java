package com.cq.example;

/**
 * 定义了一个具体的对象，可以给这个对象添加职责
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("具体对象的操作");
    }
}
