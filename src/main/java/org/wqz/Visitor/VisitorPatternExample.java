package org.wqz.Visitor;

// 测试类
public class VisitorPatternExample {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new Computer());
        objectStructure.addElement(new Mouse());

        Visitor visitor = new InfoVisitor();
        objectStructure.accept(visitor);
    }
}    