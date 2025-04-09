package org.wqz.Visitor;

// 定义访问者接口
interface Visitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
}
