package com.cq;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class InterpreterMain {
    public static void main(String[] args) {
        Context context = new Context();
        List<Expression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        for (Expression expression : list) {
            expression.interpret(context);
        }
    }
}
