package com.cq;

import com.cq.abstract_interface.DeptInterface;
import com.cq.abstract_interface.UserInterface;

import java.lang.reflect.InvocationTargetException;

/**
 * 数据访问
 * 利用反射，只需要更改一个字段即可实现对象的管理，将SqlServer改成Mysql即可切换为MySQL
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/17
 */
public class DataAccess {

    private static final String DATE_BASE_TYPE = "SqlServer";

    public static UserInterface createUser() {
        ClassLoader classLoader = DataAccess.class.getClassLoader();
        try {
            return (UserInterface) classLoader.loadClass("com.cq.impl." + DATE_BASE_TYPE + "User").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static DeptInterface createDept() {
        ClassLoader classLoader = DataAccess.class.getClassLoader();
        try {
            return (DeptInterface) classLoader.loadClass("com.cq.impl." + DATE_BASE_TYPE + "Dept").getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
