
public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(1000);

        // Using Stripe
        PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(2000);
    }
}
