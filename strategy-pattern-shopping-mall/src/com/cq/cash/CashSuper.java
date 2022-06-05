package com.cq.cash;

/**
 * 现金收费
 *
 * @author 程崎
 * @date 2022/06/05
 */
public interface CashSuper {

    /**
     * 收取现金，参数为原价，返回值为现价
     *
     * @param money 钱
     * @return double
     */
    double acceptCash(double money);

}
