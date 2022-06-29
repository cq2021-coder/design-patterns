package com.cq;

/**
 * 程崎迭代器
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/29
 */
public interface CqIterator<T> {
    /**
     * 指针前移
     *
     * @return {@link Object}
     */
    T previous();

    /**
     * 指针后移
     *
     * @return {@link Object}
     */
    T next();

    /**
     * 是否有下一个
     *
     * @return boolean
     */
    boolean hasNext();
}
