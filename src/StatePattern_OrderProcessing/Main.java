package StatePattern_OrderProcessing;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Scenario 1: New Order
        order.payOrder(); // Order paid.
        order.shipOrder(); // Order shipped.
        order.deliverOrder(); // Order delivered.

        // Scenario 2: Attempt to cancel delivered order
        order.cancelOrder(); // Cannot cancel. The order is already delivered.

        // Scenario 3: New order with cancellation
        Order anotherOrder = new Order();
        anotherOrder.cancelOrder(); // Order cancelled.
        anotherOrder.payOrder(); // Cannot pay. The order is cancelled.
    }
}
