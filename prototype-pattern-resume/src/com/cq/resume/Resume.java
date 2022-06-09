package com.cq.resume;

/**
 * 简历
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/08
 */
public class Resume implements Cloneable {

    private String name;

    private String sex;

    private String age;

    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        WorkExperience work = new WorkExperience();
        work.setWorkDate(workDate);
        work.setCompany(company);
        this.workExperience = work;
    }

    public void display() {
        System.out.println(name + " " + sex + " " + age);
        System.out.println("工作经历：" + workExperience.getWorkDate() + " " + workExperience.getCompany());
    }

    @Override
    public Resume clone() {
        try {
            return (Resume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
