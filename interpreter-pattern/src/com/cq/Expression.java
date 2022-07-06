package com.cq;

/**
 * 定义了解释器方法
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public interface Expression {
    /**
     * 解释器方法
     *
     * @param context 上下文
     */
    void interpret(Context context);
}
