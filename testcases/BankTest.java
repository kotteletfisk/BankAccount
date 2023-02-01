import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BankTest
{
    Bank bank;
    BankAccount penguin;
    SalaryAccount salary;
    BankAccount vip;

    @BeforeEach
    void setUp()
    {
        bank = new Bank();
        penguin = new PenguinAccount();
        penguin.deposit(1000);

        salary = new SalaryAccount();
        salary.setCreditlimit(-1000);
        salary.deposit(1000);

        vip = new PremiumAccount();
        vip.deposit(1000);
    }

    @Test
    void transferVIP()
    {

        assertTrue(bank.transferMoney(vip, salary, 5000));
        assertFalse(bank.transferMoney(vip, salary, -100));


        assertEquals(-4000, vip.getBalance());
        assertEquals(6000, salary.getBalance());
    }

    @Test
    void transferPenguin()
    {
        assertTrue(bank.transferMoney(penguin, salary, 500));
        assertFalse(bank.transferMoney(penguin, salary, 1000));

        assertEquals(500, penguin.getBalance());
        assertEquals(1500, salary.getBalance());
    }

    @Test
    void transferSalary()
    {
        assertTrue(bank.transferMoney(salary, penguin, 2000));
        assertFalse(bank.transferMoney(salary, vip, 500));

        assertEquals(-1000, salary.getBalance());
        assertEquals(1000, vip.getBalance());
    }

    @Test
    void exceptionTest()
    {
        assertThrows(NoSuchFuckeryException.class, () ->
        {
            bank.transferMoney(null, salary, 1000);
        });

        assertThrows(NoSuchFuckeryException.class, () ->
        {
            bank.transferMoney(vip, null, 1000);
        });
    }

}