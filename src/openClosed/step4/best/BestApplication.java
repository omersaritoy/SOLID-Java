package openClosed.step4.best;

public class BestApplication {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.process(new PaypalPayment());
        paymentService.process(new BitcoinPayment());
        paymentService.process(new CreditCardPayment());
    }
}
