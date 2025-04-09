package org.wqz.Memento;

// 管理者类，负责保存备忘录对象
class Caretaker {
    private Memento memento;

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento retrieveMemento() {
        return memento;
    }
}