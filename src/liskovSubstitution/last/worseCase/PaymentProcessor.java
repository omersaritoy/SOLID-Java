package liskovSubstitution.last.worseCase;

interface PaymentProcessor {
    void pay(double amount);
    void refund(double amount);
}