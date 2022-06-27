package com.cq.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司(树枝节点)
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/28
 */
public class ConcreteCompany extends Company {

    private final List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int dept) {
        System.out.println("-".repeat(dept) + name);
        for (Company child : children) {
            child.display(dept + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company child : children) {
            child.lineOfDuty();
        }
    }
}
