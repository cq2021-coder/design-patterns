package com.cq;

/**
 * 定义了iterator用于集合接口的遍历
 * 定义了get用于获取集合中的元素
 * 定义了add用于像集合中添加元素
 * 定义了size用于获取集合的大小
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/29
 */
public interface CqCollection<T> {
    /**
     * 对集合元素的迭代
     *
     * @return {@link CqIterator}
     */
    CqIterator<T> iterator();

    /**
     * 取得集合元素
     *
     * @param i 我
     * @return {@link T}
     */
    T get(int i);

    /**
     * 向集合添加元素
     *
     * @param t t
     * @return boolean
     */
    boolean add(T t);

    /**
     * 取得集合大小
     *
     * @return int
     */
    int size();
}
