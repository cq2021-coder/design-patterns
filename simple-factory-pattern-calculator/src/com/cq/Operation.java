package com.cq;

/**
 * 操作
 *
 * @author 程崎
 * @date 2022/06/02
 */
public abstract class Operation {
    private double numA = 0;
    private double numB = 0;

    /**
     * 得到结果
     *
     * @return double
     */
    public abstract double getResult();

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
