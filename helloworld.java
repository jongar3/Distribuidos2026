public class HelloWorld {
    
    private static final String DEFAULT_GREETING = "Hello World!!!!";

    public static void main(String[] args) {
        Greeter greeter = new Greeter(DEFAULT_GREETING);
        greeter.sayHello();
    }
}

class Greeter {
    private final String message;

    public Greeter(String message) {
        this.message = message;
    }

    public void sayHello() {
        if (message == null || message.isEmpty()) {
            System.out.println("... (Silence) ...");
        } else {
            System.out.println(message);
        }
    }
}