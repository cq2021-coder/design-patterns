package com.cq.example;

/**
 * 管理者
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/23
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
