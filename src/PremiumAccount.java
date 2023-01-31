public class PremiumAccount extends BankAccount
{

    @Override
    public void setOwner(Customer owner)
    {
        if (owner != null)
        {
            super.owner = owner;
        }
    }

    @Override
    public boolean withdraw(double amount)
    {
        balance -= amount;
        return true;
    }
}
