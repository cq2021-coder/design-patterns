package com.cq;

import java.util.Date;

/**
 * 首席技术官访客
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class CtoVisitor implements Visitor{
    @Override
    public void visit(ProjectElement element) {
        System.out.println("CTO Visitor Element");
        element.signature("CTO", new Date());
        System.out.println(element);
    }
}
