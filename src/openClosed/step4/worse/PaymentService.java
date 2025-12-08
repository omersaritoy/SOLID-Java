package openClosed.step4.worse;

public class PaymentService {
    public void pay(String type) {

        if (type.equals("credit")) {
            System.out.println("Kredi kartı ile ödeme yapıldı.");
        }
        else if (type.equals("paypal")) {
            System.out.println("PayPal ile ödeme yapıldı.");
        }
        else if (type.equals("bitcoin")) {
            System.out.println("Bitcoin ile ödeme yapıldı.");
        }
    }
}
