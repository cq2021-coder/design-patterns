package com.cq.basketball;

/**
 * 翻译
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Translation extends Player{

    private final ForeignCenter foreignCenter = new ForeignCenter();

    public Translation(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    @Override
    public void attack() {
        foreignCenter.attack();
    }

    @Override
    public void defense() {
        foreignCenter.defense();
    }
}
