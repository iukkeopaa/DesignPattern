package org.wqz.FactoryMethod;
/**
 * @Description: 具体产品
 * @Author: wjh
 * @Date: 2025/4/9 上午9:06
 */
// 抽象工厂
abstract class Creator {
    public abstract Product factoryMethod();

    public String someOperation() {
        Product product = factoryMethod();
        return product.operation();
    }
}    