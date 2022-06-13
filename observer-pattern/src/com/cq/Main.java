package com.cq;

/**
 * 观察者模式
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/13
 */
public class Main {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver("Z", concreteSubject);
        concreteSubject.attach(new ConcreteObserver("X", concreteSubject));
        concreteSubject.attach(new ConcreteObserver("Y", concreteSubject));
        concreteSubject.attach(observer);
        concreteSubject.setSubjectState("ABC");
        concreteSubject.detach(observer);
        concreteSubject.notice();
    }
}
