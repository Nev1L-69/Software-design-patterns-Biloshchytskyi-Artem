// Main.java
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        double amount = 250.75;

        // Use credit card payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(amount);

        // Switch to PayPal payment
        cart.setPaymentStrategy(new PayPalPayment("johndoe@example.com"));
        cart.checkout(amount);

        // Switch to cryptocurrency payment
        cart.setPaymentStrategy(new CryptoPayment("1A2b3C4d5E6f7G8h9I0j"));
        cart.checkout(amount);
    }
}
