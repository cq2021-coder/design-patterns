package com.cq;

/**
 * 房东
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class ColleagueLandlord extends Colleague{
    @Override
    public boolean operation(String message) {
        System.out.println("房东接收到信息：" + message);
        return true;
    }
}
