package org.wqz.Iterator;

// 定义集合接口
interface Aggregate<T> {
    Iterator<T> createIterator();
}
