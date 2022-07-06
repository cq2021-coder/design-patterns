package com.cq;

/**
 * 用户授权类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class AuthHandler extends AbstractHandler implements Handler{

    private final String name;

    public AuthHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("用户授权类：" + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
