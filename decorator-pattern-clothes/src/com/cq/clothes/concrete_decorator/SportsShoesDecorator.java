package com.cq.clothes.concrete_decorator;

import com.cq.clothes.FineryDecorator;

/**
 * 运动鞋装饰
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class SportsShoesDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("特步鞋 ");
        super.show();
    }
}
