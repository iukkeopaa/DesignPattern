package org.wqz.Visitor;

// 定义元素接口
interface Element {
    void accept(Visitor visitor);
}
