package com.cq;

/**
 * 具体主题类
 * 将有关状态存入具体观察者对象，在具体主题内部状态改变时，给所有登记的观察者发出通知
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/13
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
