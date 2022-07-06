package com.cq;

/**
 * 请求反馈类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class ResponseHandler extends AbstractHandler implements Handler{

    private final String name;

    public ResponseHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("请求反馈类：" + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
