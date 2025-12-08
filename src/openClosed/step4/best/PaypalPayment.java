package openClosed.step4.best;

public class PaypalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Payment method Paypal");
    }
}
