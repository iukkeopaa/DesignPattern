package org.wqz.FactoryMethod;

// 测试类
public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        System.out.println(creatorA.someOperation());

        Creator creatorB = new ConcreteCreatorB();
        System.out.println(creatorB.someOperation());
    }
}    