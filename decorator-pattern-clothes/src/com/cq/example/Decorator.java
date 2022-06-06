package com.cq.example;

/**
 * 装饰抽象类，从外类扩展Component类的功能，但对于Component来说是无需知道Decorator存在的
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class Decorator implements Component{

    private Component component;

    /**
     * 设置Component，处理Component的实例化
     *
     * @param component 组件
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (component != null) {
            component.operation();
        }
    }
}
