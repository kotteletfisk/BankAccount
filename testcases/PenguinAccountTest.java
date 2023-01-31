import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PenguinAccountTest {

    PenguinAccount penguinAccount;


    @BeforeAll
    void setupPenguinAccount() {
        penguinAccount = new PenguinAccount();
        penguinAccount.deposit(500);
    }

    @Test
    void setOwner() {
        Customer customer = new Customer();
        penguinAccount.setOwner(customer);
    }


    @Test
    void withdraw() {
        assertTrue(penguinAccount.withdraw(50));
    }

    @Test
    void withdrawOverdraft() {
        assertFalse(penguinAccount.withdraw(5000));
    }
}