package com.cq;


import java.util.Scanner;

/**
 * 简单工厂--计算器
 * 简单工厂适用于单纯解决对象创建的问题
 *
 * @author 程崎
 * @date 2022/06/02
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("请输入运算符");
        Scanner sc = new Scanner(System.in);
        Operation operation = OperationFactory.createOperation(sc.next());
        System.out.println("请输入两位数");
        operation.setNumA(sc.nextDouble());
        operation.setNumB(sc.nextDouble());
        System.out.println(operation.getResult());
    }
}
