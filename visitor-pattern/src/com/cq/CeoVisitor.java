package com.cq;

import java.util.Date;

/**
 * 首席执行官游客
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class CeoVisitor implements Visitor{
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CEO Visitor Element");
        element.signature("CEO", new Date());
        System.out.println(element);
    }
}
