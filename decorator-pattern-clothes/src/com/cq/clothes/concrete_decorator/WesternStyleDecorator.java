package com.cq.clothes.concrete_decorator;

import com.cq.clothes.FineryDecorator;

/**
 * 西装
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class WesternStyleDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("西装 ");
        super.show();
    }
}
