package com.cq;

/**
 * 访问者模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class VisitorMain {
    public static void main(String[] args) {
        Element element = new ProjectElement("程崎", "设计模式");
        element.accept(new CeoVisitor());
        element.accept(new CtoVisitor());
    }
}
