package com.cq.clothes.concrete_decorator;

import com.cq.clothes.FineryDecorator;

/**
 * T恤装饰器
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class TShirtDecorator extends FineryDecorator {
    @Override
    public void show() {
        System.out.print("格子衫 ");
        super.show();
    }
}
