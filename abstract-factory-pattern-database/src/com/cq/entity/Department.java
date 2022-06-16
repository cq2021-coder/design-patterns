package com.cq.entity;

/**
 * 部门
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public class Department {
    private int id;

    private String deptName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
