package com.cq.love;

/**
 * 代理
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Proxy implements GiveGift {

    private final Pursuit pursuit;

    public Proxy(SchoolGirls schoolGirls) {
        this.pursuit = new Pursuit(schoolGirls);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
