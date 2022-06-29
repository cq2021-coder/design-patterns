package com.cq;

/**
 * 迭代器模式入口函数
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/29
 */
public class IteratorMain {
    public static void main(String[] args) {
        CqCollection<String> collection = new ListCollection<>();
        collection.add("数据1");
        collection.add("数据2");
        collection.add("数据3");
        CqIterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
