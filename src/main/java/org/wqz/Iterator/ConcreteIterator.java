package org.wqz.Iterator;

import java.util.List;

// 具体的迭代器类
class ConcreteIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public ConcreteIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public T next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}