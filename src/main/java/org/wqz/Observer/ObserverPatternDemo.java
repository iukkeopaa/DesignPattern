package org.wqz.Observer;

// 测试类
public class ObserverPatternDemo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("观察者1");
        ConcreteObserver observer2 = new ConcreteObserver("观察者2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState(10);

        subject.removeObserver(observer2);

        subject.setState(20);
    }
}    