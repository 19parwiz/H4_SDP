package StrategyPattern_PaymentProcessing;

// ShoppingCart.java
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
            return;
        }
        paymentStrategy.processPayment(amount);
    }
}
