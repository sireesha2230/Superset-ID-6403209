// This is my common interface that all gateways should use
public interface PaymentHandler {
    void handlePayment(double amount);
}
