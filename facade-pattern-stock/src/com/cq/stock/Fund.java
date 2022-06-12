package com.cq.stock;

import com.cq.stock.sun.*;

/**
 * 基金类，即为外观模式的Facade
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Fund {
    private final Stock1 gu1;
    private final Stock2 gu2;
    private final Stock3 gu3;
    private final NationalDebt1 nd1;
    private final Realty1 realty1;

    public Fund() {
        gu1 = new Stock1();
        gu2 = new Stock2();
        gu3 = new Stock3();
        nd1 = new NationalDebt1();
        realty1 = new Realty1();
    }

    public void buyFund() {
        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        realty1.buy();
    }

    public void sellFund() {
        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        realty1.sell();
    }
}
