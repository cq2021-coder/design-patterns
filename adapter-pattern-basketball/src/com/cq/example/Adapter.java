package com.cq.example;

/**
 * 适配器
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Adapter extends Target{
    private final CoverTarget coverTarget = new CoverTarget();
    @Override
    public void request() {
        coverTarget.specificRequest();
    }
}
