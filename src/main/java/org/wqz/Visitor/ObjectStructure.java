package org.wqz.Visitor;

// 对象结构类
class ObjectStructure {
    private java.util.ArrayList<Element> elements = new java.util.ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
