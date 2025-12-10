package dependencyInversion.step3;



public class UserService {

    private final GmailEmailSender gmailEmailSender = new GmailEmailSender();

    public void register(String email) {
        // Kayıt işlemleri...
        gmailEmailSender.send(email, "Hoş geldin!");
    }
}
