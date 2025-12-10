package dependencyInversion.bestCase;

public interface  PaymentGateway {
    String charge(int amountInCents, String currency, String description);
}

