package dependencyInversion.bestCase;


public class StripePaymentGateway implements PaymentGateway {
    @Override
    public String charge(int amountInCents, String currency, String description) {
        // Stripe API call simulated
        if (amountInCents <= 0)
            return "invalid amount";
        // simulate a transaction id
        return "stripe_txn_" + System.currentTimeMillis();
    }
}

