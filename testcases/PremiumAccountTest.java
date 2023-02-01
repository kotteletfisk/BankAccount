import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PremiumAccountTest {
    PremiumAccount premiumAccount;

    @BeforeAll
    void setupPremiumAccount() {
        premiumAccount = new PremiumAccount();
    }

    @Test
    void setOwner() {
        Customer customer = new Customer();
        premiumAccount.setOwner(customer);
    }

    @Test
    void withdraw() {
        assertTrue(premiumAccount.withdraw(50000));
    }
}