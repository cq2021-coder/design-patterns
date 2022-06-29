package com.cq;

import java.util.ArrayList;
import java.util.List;

/**
 * CqCollection接口实现类
 *
 * @author 程崎
 * @version 1.0.0
 * @since 2022/06/29
 */
public class ListCollection<T> implements CqCollection<T>{

    public List<T> list = new ArrayList<>();

    @Override
    public CqIterator<T> iterator() {
        return new ConcreteIterator<>(this);
    }

    @Override
    public T get(int i) {
        return list.get(i);
    }

    @Override
    public boolean add(T t) {
        try {
            list.add(t);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return list.size();
    }
}
