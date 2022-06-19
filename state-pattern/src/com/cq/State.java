package com.cq;

/**
 * 抽象状态类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/19
 */
public interface State {
    /**
     * 对请求做处理
     *
     * @param context 上下文
     */
    void handle(Context context);
}
