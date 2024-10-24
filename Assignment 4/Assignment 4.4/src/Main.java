// Main.java
public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Try to ship a new order (should not be allowed)
        order.shipOrder();

        // Pay for the order
        order.payOrder();

        // Ship the order
        order.shipOrder();

        // Deliver the order
        order.deliverOrder();

        // Try to cancel the delivered order (should not be allowed)
        order.cancelOrder();

        // Attempt to pay for a delivered order (should not be allowed)
        order.payOrder();
    }
}
