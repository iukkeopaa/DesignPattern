package org.wqz.Observer.源码分析;

import java.util.ArrayList;
import java.util.List;

// 定义事件类
class Event {
    private final String message;

    public Event(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

// 定义事件发布者接口
interface EventPublisher {
    void addListener(EventListener listener);
    void removeListener(EventListener listener);
    void publishEvent(Event event);
}

// 实现事件发布者接口的具体类
class ConcreteEventPublisher implements EventPublisher {
    private final List<EventListener> listeners = new ArrayList<>();

    @Override
    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(EventListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void publishEvent(Event event) {
        for (EventListener listener : listeners) {
            listener.handleEvent(event);
        }
    }
}

// 定义事件监听器接口
interface EventListener {
    void handleEvent(Event event);
}

// 实现事件监听器接口的具体类
class ConcreteEventListener implements EventListener {
    @Override
    public void handleEvent(Event event) {
        System.out.println("Received event: " + event.getMessage());
    }
}

// 测试观察者模式
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // 创建事件发布者
        EventPublisher publisher = new ConcreteEventPublisher();
        // 创建事件监听器
        EventListener listener = new ConcreteEventListener();
        // 注册监听器
        publisher.addListener(listener);
        // 发布事件
        publisher.publishEvent(new Event("Hello, World!"));
    }
}