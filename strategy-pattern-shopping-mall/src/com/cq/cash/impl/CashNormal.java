package com.cq.cash.impl;

import com.cq.cash.CashSuper;

/**
 * 正常收费
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
