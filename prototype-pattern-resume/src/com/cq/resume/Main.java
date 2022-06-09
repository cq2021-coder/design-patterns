package com.cq.resume;

/**
 * 简历的复制，Java实现了Cloneable后，实际上为深复制，深复制也就是把对象引用的对象都复制了（和书上不一样，因为书上用到的是.Net框架的ICloneAble接口）
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Main {
    public static void main(String[] args) {
        Resume a = new Resume("程崎");
        a.setSex("男");
        a.setAge("20");
        a.setWorkExperience("2020-2022", "XX公司");

        Resume b = a.clone();
        b.setWorkExperience("2021-2022", "YY公司");

        Resume c = a.clone();
        c.setAge("21");
        c.setWorkExperience("2020-2021", "ZZ公司");

        a.display();
        b.display();
        c.display();

    }
}
