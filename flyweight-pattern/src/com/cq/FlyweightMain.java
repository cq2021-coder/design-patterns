package com.cq;

/**
 * 享元模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class FlyweightMain {
    public static void main(String[] args) {
        //首次获取内存，将创建一个内存
        Memory memory = MemoryFactory.getMemory(32);
        //释放内存
        MemoryFactory.releaseMemory(memory.getId());
        //重新获取内存
        MemoryFactory.getMemory(32);
    }
}
