public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalService;

    public PayPalAdapter(PayPalGateway payPalService) {
        this.payPalService = payPalService;
    }

    @Override
    public void processPayment(double amount) {
        payPalService.makePayment(amount);
    }
}
