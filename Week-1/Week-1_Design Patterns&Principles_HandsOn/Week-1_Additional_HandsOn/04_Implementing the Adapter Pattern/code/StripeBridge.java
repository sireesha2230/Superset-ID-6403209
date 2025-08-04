// Adapter for Stripe to match my PaymentHandler interface
public class StripeBridge implements PaymentHandler {
    private NewStripeSystem stripe;

    public StripeBridge(NewStripeSystem stripe) {
        this.stripe = stripe;
    }

    @Override
    public void handlePayment(double amount) {
        stripe.transfer(amount); // matching new method to common interface
    }
}
