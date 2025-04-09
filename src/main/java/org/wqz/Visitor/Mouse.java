package org.wqz.Visitor;

// 具体元素类：鼠标
class Mouse implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getMouseInfo() {
        return "This is a mouse.";
    }
}
