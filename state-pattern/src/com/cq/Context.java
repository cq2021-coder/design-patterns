package com.cq;

/**
 * 维护一个ConcreteState子类的实例，定义当前的状态
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/19
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        String typeName = state.getClass().getTypeName();
        System.out.println("当前状态：" + typeName.substring(typeName.lastIndexOf(".")).replace(".", ""));
    }

    public void request() {
        state.handle(this);
    }
}
