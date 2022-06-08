package com.cq.love;

/**
 * 代理模式启动类
 * 为其他对象提供一种代理以控制这个对象的访问
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Main {
    public static void main(String[] args) {
        //我要追求霍文慧，但是我和她不熟，因此我需要一个代理（孙炳辉）去帮我完成我的追求，此处没有我，但是事情都是我要做的，只是需要孙炳辉去帮助我完成
        SchoolGirls schoolGirls = new SchoolGirls();
        schoolGirls.setName("霍文慧");

        Proxy sbh = new Proxy(schoolGirls);

        sbh.giveDolls();
        sbh.giveFlowers();
        sbh.giveChocolate();
    }
}
