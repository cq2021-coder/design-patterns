package com.cq.basketball;

/**
 * 外籍中锋
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/22
 */
public class ForeignCenter {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("外籍中锋" + name + "进攻");
    }

    public void defense() {
        System.out.println("外籍中锋" + name + "防守");
    }
}
