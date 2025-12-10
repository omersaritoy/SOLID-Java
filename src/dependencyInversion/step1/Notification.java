package dependencyInversion.step1;

public class Notification {

    public void sender(NotificationType type) {

        if (type == NotificationType.SMS) {
            new Sms().sendSMS();
        }
        else if(type == NotificationType.EMAIL) {
            new Email().sendEmail();
        }

    }
}
