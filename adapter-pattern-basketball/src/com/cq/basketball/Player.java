package com.cq.basketball;

/**
 * 篮球运动员
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 攻击
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();
}
