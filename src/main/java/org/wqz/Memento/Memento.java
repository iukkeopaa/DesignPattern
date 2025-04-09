package org.wqz.Memento;

// 备忘录类，用于保存 Originator 的内部状态
class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
