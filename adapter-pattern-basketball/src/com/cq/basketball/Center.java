package com.cq.basketball;

/**
 * 中锋
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Center extends Player {
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋" + name + "进攻");
    }

    @Override
    public void defense() {
        System.out.println("中锋" + name + "防守");
    }
}
