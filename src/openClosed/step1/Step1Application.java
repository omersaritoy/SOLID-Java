package openClosed.step1;


//bir sınıfın geliştirmeye açık, değiştirmeye kapalı olması gerektiğini söyler
public class Step1Application {
    public static void main(String[] args) {
        GreetingProvider gp = new GreetingProvider();
        gp.greeting();
    }
}
