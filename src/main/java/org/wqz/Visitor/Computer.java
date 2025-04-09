package org.wqz.Visitor;

// 具体元素类：计算机
class Computer implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getComputerInfo() {
        return "This is a computer.";
    }
}