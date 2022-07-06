package com.cq;

import java.util.Date;

/**
 * 项目元素
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class ProjectElement implements Element{

    private String projectName;

    private String projectContent;

    private String visitorName;

    private Date visitorTime;

    public ProjectElement(String projectName, String projectContent) {
        this.projectName = projectName;
        this.projectContent = projectContent;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    /**
     * 用于记录访问者的签名
     *
     * @param visitorName 客人名字
     * @param visitorTime 客人时间
     */
    public void signature(String visitorName, Date visitorTime) {
        this.visitorName = visitorName;
        this.visitorTime = visitorTime;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public Date getVisitorTime() {
        return visitorTime;
    }

    public void setVisitorTime(Date visitorTime) {
        this.visitorTime = visitorTime;
    }

    @Override
    public String toString() {
        return "ProjectElement{" +
                "projectName='" + projectName + '\'' +
                ", projectContent='" + projectContent + '\'' +
                ", visitorName='" + visitorName + '\'' +
                ", visitorTime=" + visitorTime +
                '}';
    }
}
