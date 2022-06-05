package com.cq.cash;

import java.util.Scanner;

/**
 * 商场促销--策略模式+简单工厂
 * 概念：策略模式是一种定义一系列算法的方法，所有的方法完成的都是相同的工作，只是实现不同，他可以以相同的方式调用所有的算法，减少了各种算法类与使用算法之间的耦合
 * 优点：简化了单元测试，每个算法都有自己的类，可以单独测试；每个算法之间无关联
 * 单纯的策略模式需要在客户端处理对象的创建，所以和简单工厂结合，即让选择实现的职责交给Context去处理，减轻客户端的职责
 *
 * @author 程崎
 * @date 2022/06/05
 */
public class Main {

    private static final String[] TYPES = {"正常收费", "打八折", "满300减100"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------请选择类型--------------");
        for (int i = 0; i < TYPES.length; i++) {
            System.out.print(i + "：" + TYPES[i] + "\t");
        }
        System.out.println();
        CashContext context = new CashContext(sc.nextInt());
        System.out.println("--------------请输入实际支付金额--------------");
        double realMoney = sc.nextDouble();
        System.out.println("--------------促销后所需付款--------------");
        System.out.println(context.getResult(realMoney));
    }
}
