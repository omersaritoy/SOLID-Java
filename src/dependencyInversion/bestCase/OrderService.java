package dependencyInversion.bestCase;

public class OrderService {

    private final PaymentGateway paymentGateway;

    // DIP: PaymentGateway (abstraction) constructor ile inject ediliyor
    public OrderService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String payOrder(PaymentRequest request) {
        // business logic burada: veritabanı güncellemesi, stok kontrol vs.
        // ödeme çağrısı
        return paymentGateway.charge(request.getAmountInCents(), request.getCurrency(), request.getDescription());
    }

}

