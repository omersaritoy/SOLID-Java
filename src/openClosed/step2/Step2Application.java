package openClosed.step2;

import openClosed.step2.GreetingProvider;

public class Step2Application {
    public static void main(String[] args) {
        GreetingProvider greetingProvider = new GreetingProvider();
        greetingProvider.greeting("Hello World");
    }
}
