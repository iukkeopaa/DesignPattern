package org.wqz.FactoryMethod;
/**
 * @Description: 具体产品
 * @Author: wjh
 * @Date: 2025/4/9 上午9:06
 */
// 具体产品 A
class ConcreteProductA implements Product {
    @Override
    public String operation() {
        return "ConcreteProductA operation";
    }
}   