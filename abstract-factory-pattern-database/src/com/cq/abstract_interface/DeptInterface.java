package com.cq.abstract_interface;

import com.cq.entity.Department;

/**
 * 部门接口
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public interface DeptInterface {

    /**
     * 插入
     *
     * @param department 部门
     */
    void insert(Department department);

    /**
     * 得到部门
     *
     * @param id id
     * @return {@link Department}
     */
    Department getDept(int id);

}
