package openClosed.step4.best;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment Method CreditCardPayment");
    }
}
