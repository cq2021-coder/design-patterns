package com.cq.cash.impl;

import com.cq.cash.CashSuper;

/**
 * 打折收费
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1;

    public CashRebate() {
    }

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
