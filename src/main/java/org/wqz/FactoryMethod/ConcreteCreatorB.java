package org.wqz.FactoryMethod;
/**
 * @Description: 具体产品
 * @Author: wjh
 * @Date: 2025/4/9 上午9:06
 */
// 具体工厂 B
class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}    