package com.cq;

/**
 * 业务处理类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class BusinessHandler extends AbstractHandler implements Handler{

    private final String name;

    public BusinessHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("业务处理类：" + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
