package com.cq.example;

/**
 * 定义一个对象接口，可以给这些对象动态添加职责
 *
 * @author 程崎
 * @date 2022/06/06
 */
public interface Component {
    /**
     * 动态添加职责
     */
    void operation();
}
