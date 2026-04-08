import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxOfThreeTest {

    MaxOfThree obj = new MaxOfThree();

    @Test
    void testFirstIsMax() {
        assertEquals(30, obj.findMax(30, 20, 10));
    }

    @Test
    void testSecondIsMax() {
        assertEquals(40, obj.findMax(10, 40, 20));
    }

    @Test
    void testThirdIsMax() {
        assertEquals(50, obj.findMax(10, 20, 50));
    }

    @Test
    void testAllEqual() {
        assertEquals(10, obj.findMax(10, 10, 10));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-1, obj.findMax(-5, -1, -10));
    }
}
