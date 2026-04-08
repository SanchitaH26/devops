import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    LinearSearch ls = new LinearSearch();

    @Test
    void testElementFound() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(2, ls.search(arr, 30)); // index 2
    }

    @Test
    void testElementNotFound() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(-1, ls.search(arr, 60));
    }

    @Test
    void testFirstElement() {
        int[] arr = {5, 10, 15};
        assertEquals(0, ls.search(arr, 5));
    }

    @Test
    void testLastElement() {
        int[] arr = {5, 10, 15};
        assertEquals(2, ls.search(arr, 15));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, ls.search(arr, 10));
    }
}
