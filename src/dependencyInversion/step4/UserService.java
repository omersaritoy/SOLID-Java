package dependencyInversion.step4;

public class UserService {
    private final EmailSender emailSender;

    public UserService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void register(String email) {
        emailSender.send(email,"Hoş geldin!");
    }
}
