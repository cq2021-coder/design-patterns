package com.cq;

/**
 * 产品
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/12
 */
public class Product {
    private String componentA = "默认的A零件";
    private String componentB = "默认的B零件";
    private String componentC = "默认的C零件";
    private String componentD = "默认的D零件";

    public Product addComponentA(String componentA) {
        this.componentA = componentA;
        return this;
    }

    public Product addComponentB(String componentB) {
        this.componentB = componentB;
        return this;
    }

    public Product addComponentC(String componentC) {
        this.componentC = componentC;
        return this;
    }

    public Product addComponentD(String componentD) {
        this.componentD = componentD;
        return this;
    }

    public void show() {
        System.out.printf("零件a：%s\t零件b：%s\t零件c：%s\t零件d：%s\n", componentA, componentB, componentC, componentD);
    }

}
