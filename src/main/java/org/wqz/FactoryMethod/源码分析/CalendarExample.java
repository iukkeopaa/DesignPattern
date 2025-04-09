package org.wqz.FactoryMethod.源码分析;

import java.util.Calendar;

/**
 * @Description:
 * @Author: wjh
 * @Date: 2025/4/9 上午10:13
 */
public class CalendarExample {
    public static void main(String[] args) {
        // 使用工厂方法获取 Calendar 实例
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
