package liskovSubstitution.last.worseCase;


class PaypalPaymentProcessor implements PaymentProcessor {
    public void pay(double amount) { /* işlem yapılır */ }
    public void refund(double amount) { /* iade yapılır */ }
}