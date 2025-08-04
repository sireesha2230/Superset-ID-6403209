// Trying out Adapter Pattern with PayPal and Stripe gateways

public class MainAdapterDemo {
    public static void main(String[] args) {
        
        // PayPal setup
        OldPayPalSystem payPalService = new OldPayPalSystem();  // using the old payment method
        PaymentHandler payPalHandler = new PayPalBridge(payPalService); // connect using adapter
        payPalHandler.handlePayment(150.0); // now using unified method

        // Stripe setup
        NewStripeSystem stripeService = new NewStripeSystem(); // newer payment method
        PaymentHandler stripeHandler = new StripeBridge(stripeService); // adapter in action
        stripeHandler.handlePayment(250.0); // same method call for different system
    }
}
