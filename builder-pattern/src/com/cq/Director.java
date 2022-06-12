package com.cq;

/**
 * 指挥者类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Director {
    /**
     * 构造
     */
    public Product construct(Builder builder) {
        return builder.build();
    }
}
