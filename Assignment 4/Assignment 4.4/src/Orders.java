
class NewOrder implements State {
    private Order order;

    public NewOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order has been paid.");
        order.setState(order.getPaidOrderState());
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship the order. The order is not paid yet.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver the order. The order is not shipped yet.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        order.setState(order.getCancelledOrderState());
    }
}

class PaidOrder implements State {
    private Order order;

    public PaidOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is being shipped.");
        order.setState(order.getShippedOrderState());
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver the order. The order is not shipped yet.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order has been cancelled.");
        order.setState(order.getCancelledOrderState());
    }
}

class ShippedOrder implements State {
    private Order order;

    public ShippedOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already shipped.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is delivered.");
        order.setState(order.getDeliveredOrderState());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel the order. The order is already shipped.");
    }
}

class DeliveredOrder implements State {
    private Order order;

    public DeliveredOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Order is already paid.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Order is already delivered. Cannot ship it again.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order is already delivered.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Cannot cancel the order. The order is already delivered.");
    }
}

class CancelledOrder implements State {
    private Order order;

    public CancelledOrder(Order order) {
        this.order = order;
    }

    @Override
    public void payOrder() {
        System.out.println("Cannot pay for a cancelled order.");
    }

    @Override
    public void shipOrder() {
        System.out.println("Cannot ship a cancelled order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Cannot deliver a cancelled order.");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order is already cancelled.");
    }
}
