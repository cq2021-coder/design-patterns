package com.cq;

import com.cq.abstract_interface.DeptInterface;
import com.cq.abstract_interface.UserInterface;
import com.cq.entity.Department;
import com.cq.entity.User;

/**
 * 抽象工厂启动类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = DataAccess.createUser();
        userInterface.insert(new User());
        userInterface.getUser(1);
        DeptInterface deptInterface = DataAccess.createDept();
        deptInterface.insert(new Department());
        deptInterface.getDept(1);
    }
}
