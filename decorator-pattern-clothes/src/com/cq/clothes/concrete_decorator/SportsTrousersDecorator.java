package com.cq.clothes.concrete_decorator;

import com.cq.clothes.FineryDecorator;

/**
 * 运动裤装饰器
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class SportsTrousersDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("运动裤 ");
        super.show();
    }
}
