package com.cq;

/**
 * 本抽象类将责任链上的各个组件连接起来
 * 具体操作是通过setHandler设置下一个环节的组件
 * 通过getHandler获取下一个环节的组件
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
