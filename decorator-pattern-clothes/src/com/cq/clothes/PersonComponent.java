package com.cq.clothes;

/**
 * 人类（ConcreteComponent）
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class PersonComponent {
    private String name;

    public PersonComponent() {
    }

    public PersonComponent(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
