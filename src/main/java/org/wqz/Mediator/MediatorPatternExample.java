package org.wqz.Mediator;

// 测试类
public class MediatorPatternExample {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ConcreteUser(chatRoom, "张三");
        User user2 = new ConcreteUser(chatRoom, "李四");
        User user3 = new ConcreteUser(chatRoom, "王五");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("大家好！");
    }
}    