package com.cq;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 内存工厂
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/07/06
 */
public class MemoryFactory {
    private static List<Memory> memoryList = new ArrayList<>();

    public static Memory getMemory(int size) {
        Memory memory = null;
        for (int i = 0; i < memoryList.size(); i++) {
            memory = memoryList.get(i);
            if (memory.getSize() == size && !memory.isUsed()) {
                memory.setUsed(true);
                memoryList.add(i, memory);
                System.out.println("从memoryList中获取内存对象：" + memory);
                break;
            }
        }
        if (memory == null) {
            memory = new Memory(size, false, UUID.randomUUID().toString());
            System.out.println("从系统中开辟一块内存放入memoryList" + memory);
            memoryList.add(memory);
        }
        return memory;
    }

    public static void releaseMemory(String id) {
        for (Memory memory : memoryList) {
            if (memory.getId().equals(id)) {
                memory.setUsed(false);
                System.out.println("释放内存：" + memory.getId());
                return;
            }
        }
    }
}
