package org.wqz.Visitor;

// 具体访问者类：信息访问者
class InfoVisitor implements Visitor {
    @Override
    public void visit(Computer computer) {
        System.out.println(computer.getComputerInfo());
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println(mouse.getMouseInfo());
    }
}