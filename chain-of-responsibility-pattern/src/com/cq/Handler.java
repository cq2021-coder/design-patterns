package com.cq;

/**
 * 本接口用于规定责任链上各个环节的操作，这里定义了operator，用于在责任链上各个环节处理任务时进行调用
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public interface Handler {
    /**
     * 在责任链上各个环节处理任务时进行调用
     */
    void operator();
}
