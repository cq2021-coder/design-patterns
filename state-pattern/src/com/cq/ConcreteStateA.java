package com.cq;

/**
 * 设置ConcreteStateA的下一状态是ConcreteStateB
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/19
 */
public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
