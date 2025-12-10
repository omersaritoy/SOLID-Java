package dependencyInversion.bestCase;

public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public String charge(int amountInCents, String currency, String description) {
        if (amountInCents <= 0) return ("Invalid amount");
        return "paypal_txn_" + System.currentTimeMillis();
    }


}