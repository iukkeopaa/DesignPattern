package org.wqz.Memento;

// 主类，用于测试备忘录模式
public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.saveMemento(originator.saveStateToMemento());

        originator.setState("State #3");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.retrieveMemento());
        System.out.println("Restored State: " + originator.getState());
    }
}    