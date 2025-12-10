package dependencyInversion.step4;

public interface EmailSender {
    void send(String to, String message);
}
