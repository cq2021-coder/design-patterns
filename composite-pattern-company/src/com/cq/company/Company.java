package com.cq.company;

/**
 * 公司(抽象类)
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加
     *
     * @param company 公司
     */
    public abstract void add(Company company);

    /**
     * 删除
     *
     * @param company 公司
     */
    public abstract void remove(Company company);

    /**
     * 显示
     *
     * @param dept 部门
     */
    public abstract void display(int dept);

    /**
     * 履行职责（不同的部分需要履行不同的职责）
     */
    public abstract void lineOfDuty();

}
