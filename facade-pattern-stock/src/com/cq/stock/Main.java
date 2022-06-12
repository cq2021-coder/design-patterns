package com.cq.stock;

/**
 * 利用一个基金（外观）购买多支股票
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Main {
    public static void main(String[] args) {
        Fund fund = new Fund();
        fund.buyFund();
        fund.sellFund();
    }
}
