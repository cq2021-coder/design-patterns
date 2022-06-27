package com.cq.company.leaf;

import com.cq.company.Company;

/**
 * 人力资源部门
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public class HrDepartment extends Company {

    public HrDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int dept) {
        System.out.println("-".repeat(dept) + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name+"员工招聘培训管理");
    }
}
