import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SalaryAccountTest {
    SalaryAccount salaryAccount;

    @BeforeAll
    void setupSalaryAccount() {
        salaryAccount = new SalaryAccount();

    }

    @Test
    void setOwner() {
        Customer customer = new Customer();
        salaryAccount.setOwner(customer);
    }

    @Test
    void withdraw() {
        assertFalse(salaryAccount.withdraw(5000));
    }

    @Test
    void setCreditlimit() {
        salaryAccount.setCreditlimit(-5000);
        assertTrue(salaryAccount.withdraw(4000));
    }

}