package StatePattern_OrderProcessing;

public class DeliveredOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Order already shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel. The order is already delivered.");
    }
}
