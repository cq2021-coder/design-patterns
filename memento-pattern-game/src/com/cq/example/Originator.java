package com.cq.example;

/**
 * 发起者
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/23
 */
public class Originator {
    /**
     * 需要保存的属性，可能有多个
     */
    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.state();
    }

    public void show() {
        System.out.println("state=" + state);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
