package org.wqz.Singleton.源码分析;

import java.util.HashMap;
import java.util.Map;

// 模拟 Spring 的 Bean 工厂
class BeanFactory {
    // 用于存储单例 Bean 的缓存
    private Map<String, Object> singletonObjects = new HashMap<>();

    // 获取 Bean 的方法
    public Object getBean(String beanName) {
        // 先从缓存中获取 Bean
        Object bean = singletonObjects.get(beanName);
        if (bean == null) {
            // 若缓存中不存在，则创建新的 Bean 实例
            bean = createBean(beanName);
            // 将新创建的 Bean 放入缓存
            singletonObjects.put(beanName, bean);
        }
        return bean;
    }

    // 创建 Bean 的方法
    private Object createBean(String beanName) {
        try {
            // 这里简单模拟通过反射创建 Bean 实例
            Class<?> beanClass = Class.forName(beanName);
            return beanClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

// 测试单例模式
public class SingletonPatternDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        // 获取同一个 Bean 两次
        Object bean1 = beanFactory.getBean("com.example.DemoBean");
        Object bean2 = beanFactory.getBean("com.example.DemoBean");
        // 验证是否为同一个实例
        System.out.println(bean1 == bean2); 
    }
}