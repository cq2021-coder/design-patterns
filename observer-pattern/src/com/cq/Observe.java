package com.cq;

/**
 * 观察者
 * 为所有的具体观察者定义一个接口，在得到主题的通知时更新自己
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/13
 */
public interface Observe {
    /**
     * 更新
     */
    void update();
}
