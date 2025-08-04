// Adapter for PayPal to match my common interface
public class PayPalBridge implements PaymentHandler {
    private OldPayPalSystem payPal;

    public PayPalBridge(OldPayPalSystem payPal) {
        this.payPal = payPal;
    }

    @Override
    public void handlePayment(double amount) {
        payPal.pay(amount); // converting interface call to legacy method
    }
}
