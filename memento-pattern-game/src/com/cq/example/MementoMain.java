package com.cq.example;

/**
 * 备忘录模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/23
 */
public class MementoMain {
    public static void main(String[] args) {
        //初始状态为on
        Originator originator = new Originator();
        originator.setState("on");
        originator.show();

        //保存状态时，可以隐藏掉实现细节
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        //改变状态属性为off
        originator.setState("off");
        originator.show();

        //恢复初始状态
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
