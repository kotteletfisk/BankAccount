public class SalaryAccount extends BankAccount
{
    double creditlimit = 0;

    @Override
    public void setOwner(Customer owner)
    {
        if (owner != null)
        {
            this.owner = owner;
        }
    }

    @Override
    public boolean withdraw(double amount)
    {
        double status = balance - amount;
        if (status >= creditlimit)
        {
            balance -= amount;
            return true;
        }

        return false;
    }

    public void setCreditlimit(double creditlimit)
    {
        if (creditlimit < 0)
        {
            this.creditlimit = creditlimit;
        }
    }

    public double getCreditlimit()
    {
        return creditlimit;
    }
}
