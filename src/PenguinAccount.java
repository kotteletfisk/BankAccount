public class PenguinAccount extends BankAccount
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
        if (amount <= balance)
        {
            balance -= amount;
            return true;
        }

        return false;
    }
}
