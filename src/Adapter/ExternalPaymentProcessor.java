package Adapter;

public class ExternalPaymentProcessor {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using External Payment Processor.");
    }
}
