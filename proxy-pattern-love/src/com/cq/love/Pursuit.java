package com.cq.love;

/**
 * 追求
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Pursuit implements GiveGift{

    private SchoolGirls schoolGirls;

    public Pursuit(SchoolGirls schoolGirls) {
        this.schoolGirls = schoolGirls;
    }

    public Pursuit() {
    }

    @Override
    public void giveDolls() {
        System.out.println("送"+schoolGirls.getName()+"娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送"+schoolGirls.getName()+"鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送"+schoolGirls.getName()+"巧克力");
    }
}
