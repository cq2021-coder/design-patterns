package com.cq.clothes.concrete_decorator;

import com.cq.clothes.FineryDecorator;

/**
 * 牛仔裤装饰
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class JeansDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("牛仔裤 ");
        super.show();
    }
}
