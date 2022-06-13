package com.cq;

/**
 * 具体观察者
 * 实现抽象观察者角色所要求的更新接口，以便是本身的状态与主题的状态相协调
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/13
 */
public class ConcreteObserver implements Observe{

    private final String name;

    private ConcreteSubject subject;

    public ConcreteObserver(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    public ConcreteSubject getSubject() {
        return subject;
    }

    public void setSubject(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        String observerState = subject.getSubjectState();
        System.out.printf("观察者%s的新状态是%s\n", name, observerState);
    }
}
