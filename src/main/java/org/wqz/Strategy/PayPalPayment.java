package org.wqz.Strategy;

// PayPal 支付策略实现
class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("使用 PayPal 支付了 " + amount + " 元");
    }
}    