package StatePattern_OrderProcessing;

public class NewOrderState implements State {
    @Override
    public void payOrder(Order order) {
        System.out.println("Order paid.");
        order.setState(new PaidOrderState());
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship. The order is not paid yet.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver. The order is not shipped yet.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledOrderState());
    }
}
