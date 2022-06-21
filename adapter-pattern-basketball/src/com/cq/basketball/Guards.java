package com.cq.basketball;

/**
 * 后卫
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("后卫" + name + "防守");
    }
}
