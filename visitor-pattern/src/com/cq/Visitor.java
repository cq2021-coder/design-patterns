package com.cq;

/**
 * 定义了visit方法用于制定要访问的数据
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public interface Visitor {
    /**
     * 指定要访问的数据
     *
     * @param element 元素
     */
    void visit(ProjectElement element);
}
