package dependencyInversion.step2;

public class Sms implements Message {
    @Override
    public void sendMessage() {
        sendSms();
    }

    private void sendSms() {

    }
}
