import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CustomerTest
{
    Customer customer;
    @BeforeAll
    void generateCustomer()
    {
        customer = new Customer();
    }

    @Test
    void addAccount()
    {
        customer.addAccount(new SalaryAccount());
        assertEquals(1, customer.accounts.size());
    }

    @Test
    void setName()
    {
        customer.setName("Lars");
        assertEquals("Lars", customer.getName());

       customer.setName("Lars4");
       assertNull(customer.getName());
    }

    @Test
    void setStatus()
    {
        customer.setStatus(Status.VIP);
        assertEquals(Status.VIP ,customer.getStatus());
    }

    @Test
    void testRemove()
    {
        customer.remove(customer.accounts.get(0));
        assertEquals(0, customer.accounts.size());
    }
}