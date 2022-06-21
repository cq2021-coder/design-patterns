package com.cq.basketball;

/**
 * 前锋
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Forwards extends Player {
    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("前锋" + name + "防守");
    }
}
