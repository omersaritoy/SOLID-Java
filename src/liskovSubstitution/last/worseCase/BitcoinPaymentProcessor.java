package liskovSubstitution.last.worseCase;

class BitcoinPaymentProcessor implements PaymentProcessor {
    public void pay(double amount) { /* bitcoin ödemesi */ }

    public void refund(double amount) {
        throw new UnsupportedOperationException("Bitcoin refund desteklemez!");
    }
}
