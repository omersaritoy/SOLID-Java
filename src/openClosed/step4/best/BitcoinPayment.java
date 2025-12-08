package openClosed.step4.best;

public class BitcoinPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment Method Bitcoin");
    }
}
