public class GreetingService {

    // Method to return greeting message
    public String greet() {
        return "Hello, Welcome to DevOps!";
    }

    // Method with name
    public String greetUser(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, Guest!";
        }
        return "Hello, " + name + "!";
    }

    // Main method (for execution/demo)
    public static void main(String[] args) {
        GreetingService service = new GreetingService();

        System.out.println(service.greet());
        System.out.println(service.greetUser("Sanchita"));
        System.out.println(service.greetUser(""));
    }
}
