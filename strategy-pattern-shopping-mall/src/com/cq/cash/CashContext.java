package com.cq.cash;

import com.cq.cash.impl.CashNormal;
import com.cq.cash.impl.CashRebate;
import com.cq.cash.impl.CashReturn;

/**
 * 现金上下文
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class CashContext {

    private final CashSuper cashSuper;

    public CashContext(int type) {
        switch (type) {
            case 0 -> cashSuper = new CashNormal();
            case 1 -> cashSuper = new CashRebate(0.8);
            case 2 -> cashSuper = new CashReturn(300, 100);
            default -> throw new NullPointerException("未找到指定类型");
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
