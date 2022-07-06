package com.cq;

/**
 * 非终结符表达式
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class NonterminalExpression implements Expression{


    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
