package org.wqz.FactoryMethod.源码分析;

// 定义 Bean 接口
interface Bean {
    void doSomething();
}

// 实现 Bean 接口的具体类
class ConcreteBean implements Bean {
    @Override
    public void doSomething() {
        System.out.println("ConcreteBean is doing something.");
    }
}

// 定义 Bean 工厂接口
interface BeanFactory {
    Bean getBean();
}

// 实现 Bean 工厂接口的具体工厂类
class ConcreteBeanFactory implements BeanFactory {
    @Override
    public Bean getBean() {
        return new ConcreteBean();
    }
}

// 测试工厂模式
public class FactoryPatternDemo {
    public static void main(String[] args) {
        BeanFactory factory = new ConcreteBeanFactory();
        Bean bean = factory.getBean();
        bean.doSomething();
    }
}