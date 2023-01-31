public abstract class BankAccount
{
    protected double balance;

    protected Customer owner;

    private int id;


    public abstract void setOwner(Customer owner);

    public abstract boolean withdraw(double amount);

    public int getId()
    {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public Customer getOwner()
    {
        return owner;
    }

    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
    }
}
