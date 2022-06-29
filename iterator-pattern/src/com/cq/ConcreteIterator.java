package com.cq;

/**
 * 具体迭代器
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/29
 */
public class ConcreteIterator<T> implements CqIterator<T> {

    private final CqCollection<T> collection;

    /**
     * 当前迭代器遍历的元素位置
     */
    private int pos = -1;

    public ConcreteIterator(CqCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public T previous() {
        if (pos > 0) {
            pos--;
        }
        return collection.get(pos);
    }

    @Override
    public T next() {
        if (pos < collection.size() - 1) {
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        return pos < collection.size() - 1;
    }
}
