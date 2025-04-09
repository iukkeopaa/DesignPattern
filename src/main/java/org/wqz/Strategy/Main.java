package org.wqz.Strategy;

// 主类，测试策略模式
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // 使用信用卡支付
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.0);

        // 使用 PayPal 支付
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200.0);
    }
}    