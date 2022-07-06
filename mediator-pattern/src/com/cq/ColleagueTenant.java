package com.cq;

/**
 * 租户
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class ColleagueTenant extends Colleague{
    @Override
    public boolean operation(String message) {
        System.out.println("房客收到信息：" + message);
        return true;
    }
}
