package com.cq;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题类
 * 将所有对观察者对象的引用保存在一个聚焦里，每个主题都可以有任何数量的观察者。
 * 抽象主题提供一个接口，可以增加和删除观察者模式
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/13
 */
public class Subject {
    private final List<Observe> observes = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observe 观察
     */
    public void attach(Observe observe) {
        observes.add(observe);
    }

    /**
     * 移除观察者
     *
     * @param observe 观察
     */
    public void detach(Observe observe) {
        observes.remove(observe);
    }

    public void notice() {
        for (Observe observe : observes) {
            observe.update();
        }
    }
}
