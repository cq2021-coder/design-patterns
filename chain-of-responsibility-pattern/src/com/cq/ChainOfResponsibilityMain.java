package com.cq;

/**
 * 责任链入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        AuthHandler authHandler = new AuthHandler("auth");
        BusinessHandler businessHandler = new BusinessHandler("business");
        authHandler.setHandler(businessHandler);
        businessHandler.setHandler(new ResponseHandler("response"));
        authHandler.operator();
    }
}
