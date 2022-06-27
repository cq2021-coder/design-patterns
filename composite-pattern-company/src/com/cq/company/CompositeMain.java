package com.cq.company;

import com.cq.company.leaf.FinanceDepartment;
import com.cq.company.leaf.HrDepartment;

/**
 * 组合模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public class CompositeMain {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("程崎总公司");
        root.add(new HrDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company01 = new ConcreteCompany("上海华东分公司");
        company01.add(new HrDepartment("华东分公司人力资源部"));
        company01.add(new FinanceDepartment("华东分公司财务部"));
        root.add(company01);

        ConcreteCompany company02 = new ConcreteCompany("南京办事处");
        company02.add(new HrDepartment("南京办事处人力资源部"));
        company02.add(new FinanceDepartment("南京办事处财务部"));
        company01.add(company02);

        ConcreteCompany company03 = new ConcreteCompany("杭州办事处");
        company03.add(new HrDepartment("杭州办事处人力资源部"));
        company03.add(new FinanceDepartment("杭州办事处财务部"));
        company02.add(company03);

        System.out.println("结构图");
        root.display(1);

        System.out.println("\n职责：");
        root.lineOfDuty();
    }
}
