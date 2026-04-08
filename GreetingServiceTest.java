import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    GreetingService service = new GreetingService();

    @Test
    void testGreet() {
        assertEquals("Hello, Welcome to DevOps!", service.greet());
    }

    @Test
    void testGreetUserWithName() {
        assertEquals("Hello, Sanchita!", service.greetUser("Sanchita"));
    }

    @Test
    void testGreetUserEmpty() {
        assertEquals("Hello, Guest!", service.greetUser(""));
    }

    @Test
    void testGreetUserNull() {
        assertEquals("Hello, Guest!", service.greetUser(null));
    }
}
