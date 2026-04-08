import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BankServiceTest {

    @Test
    void testInitialBalance() {
        BankService.BankAccount acc = new BankService.BankAccount(1000);
        assertEquals(1000, acc.getBalance());
    }

    @Test
    void testDeposit() {
        BankService.BankAccount acc = new BankService.BankAccount(1000);
        acc.deposit(500);
        assertEquals(1500, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        BankService.BankAccount acc = new BankService.BankAccount(1000);
        acc.withdraw(300);
        assertEquals(700, acc.getBalance());
    }

    @Test
    void testInvalidDeposit() {
        BankService.BankAccount acc = new BankService.BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.deposit(0);
        });
    }

    @Test
    void testInvalidWithdrawMoreThanBalance() {
        BankService.BankAccount acc = new BankService.BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(1500);
        });
    }

    @Test
    void testInvalidWithdrawNegative() {
        BankService.BankAccount acc = new BankService.BankAccount(1000);
        assertThrows(IllegalArgumentException.class, () -> {
            acc.withdraw(-100);
        });
    }

    @Test
    void testNegativeInitialBalance() {
        assertThrows(IllegalArgumentException.class, () -> {
            new BankService.BankAccount(-500);
        });
    }
}
