package org.wqz.Strategy;

// 信用卡支付策略实现
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用信用卡支付了 " + amount + " 元");
    }
}    