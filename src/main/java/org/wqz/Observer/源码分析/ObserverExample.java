package org.wqz.Observer.源码分析;

import java.util.Observable;
import java.util.Observer;

class MyObservable extends Observable {
    public void setChangedAndNotify() {
        setChanged();
        notifyObservers();
    }
}

class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("状态已更新");
    }
}

public class ObserverExample {
    public static void main(String[] args) {
        MyObservable observable = new MyObservable();
        MyObserver observer = new MyObserver();
        observable.addObserver(observer);
        observable.setChangedAndNotify();
    }
}