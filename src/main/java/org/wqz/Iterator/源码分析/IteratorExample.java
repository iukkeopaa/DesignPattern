package org.wqz.Iterator.源码分析;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//迭代器模式提供了一种方法来顺序访问一个聚合对象中的各个元素，而又不暴露该对象的内部表示
//在这个示例中，ArrayList 类实现了 Collection 接口，通过 iterator() 方法可以获取一个 Iterator 对象，用于遍历列表中的元素。
public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}