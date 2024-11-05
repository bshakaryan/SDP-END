package Adapter;

public class PaymentAdapter implements PaymentGateway {
    private ExternalPaymentProcessor paymentProcessor = new ExternalPaymentProcessor();

    @Override
    public void processPayment(double amount) {
        paymentProcessor.makePayment(amount); // Adapter translates call to external API
    }
}
