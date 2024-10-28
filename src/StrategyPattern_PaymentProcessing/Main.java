package StrategyPattern_PaymentProcessing;
// Main.java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Using Credit Card Payment
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.00);

        // Using PayPal Payment
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200.00);

        // Using Cryptocurrency Payment
        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300.00);
    }
}
