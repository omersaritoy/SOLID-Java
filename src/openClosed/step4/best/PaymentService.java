package openClosed.step4.best;

public class PaymentService {
    public void process(PaymentMethod method) {
        method.pay();
    }
}
