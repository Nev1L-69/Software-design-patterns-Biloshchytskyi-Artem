// Order.java
public class Order {
    private State newOrderState;
    private State paidOrderState;
    private State shippedOrderState;
    private State deliveredOrderState;
    private State cancelledOrderState;

    private State currentState;

    public Order() {
        newOrderState = new NewOrder(this);
        paidOrderState = new PaidOrder(this);
        shippedOrderState = new ShippedOrder(this);
        deliveredOrderState = new DeliveredOrder(this);
        cancelledOrderState = new CancelledOrder(this);

        currentState = newOrderState; // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void payOrder() {
        currentState.payOrder();
    }

    public void shipOrder() {
        currentState.shipOrder();
    }

    public void deliverOrder() {
        currentState.deliverOrder();
    }

    public void cancelOrder() {
        currentState.cancelOrder();
    }

    public State getNewOrderState() {
        return newOrderState;
    }

    public State getPaidOrderState() {
        return paidOrderState;
    }

    public State getShippedOrderState() {
        return shippedOrderState;
    }

    public State getDeliveredOrderState() {
        return deliveredOrderState;
    }

    public State getCancelledOrderState() {
        return cancelledOrderState;
    }
}
