package com.cq;

/**
 * 本类持有中介者对象并定义了同事类的具体操作方法
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 同事类的操作
     *
     * @param message 消息
     * @return boolean
     */
    public abstract boolean operation(String message);
}
