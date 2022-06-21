package com.cq.basketball;

/**
 * 适配器模式示例入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class Main {
    public static void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attack();

        Player m = new Guards("麦克格雷迪");
        m.attack();

        Player ym = new Translation("姚明");
        ym.attack();
        ym.defense();
    }
}
