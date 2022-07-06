package com.cq;

/**
 * 抽象元素，定义了accept方法接收访问者对象
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public interface Element {
    /**
     * 接收访问者对象
     *
     * @param visitor 游客
     */
    void accept(Visitor visitor);
}
