package com.cq.cash.impl;

import com.cq.cash.CashSuper;

/**
 * 返利收费
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class CashReturn implements CashSuper {

    /**
     * 返利条件
     */
    private double moneyCondition = 0;

    /**
     * 返利值
     */
    private double moneyReturn = 0;


    public CashReturn() {
    }

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            money -= moneyReturn;
        }
        return money;
    }
}
