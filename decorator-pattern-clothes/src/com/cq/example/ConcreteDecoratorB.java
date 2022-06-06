package com.cq.example;

/**
 * 继承Decorator
 *
 * @author 程崎
 * @date 2022/06/06
 */
public class ConcreteDecoratorB extends Decorator {

    /**
     * 设置Component，处理Component的实例化
     */
    @Override
    public void operation() {
        super.operation();
        System.out.println(addBehavior("B") + "的操作");
    }

    /**
     * 特有方法，区别于A
     *
     * @param type 类型
     * @return {@link String}
     */
    public String addBehavior(String type) {
        return "具体装饰对象" + type;
    }
}
