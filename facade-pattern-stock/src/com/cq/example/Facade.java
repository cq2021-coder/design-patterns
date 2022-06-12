package com.cq.example;

import com.cq.example.sun.SubSystemFour;
import com.cq.example.sun.SubSystemOne;
import com.cq.example.sun.SubSystemThree;
import com.cq.example.sun.SubSystemTwo;

/**
 * 外观类，需要了解所有的子系统的方法或者属性，进行组合，以备外界调用
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Facade {

    private final SubSystemOne subSystemOne;

    private final SubSystemTwo subSystemTwo;

    private final SubSystemThree subSystemThree;

    private final SubSystemFour subSystemFour;

    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
        subSystemFour = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("\n方法组A======");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        subSystemFour.methodFour();
    }

    public void methodB() {
        System.out.println("\n方法组B======");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
    }
}
