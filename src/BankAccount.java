public abstract class BankAccount
{
    protected double balance;

    protected Customer owner;

    private static int id_buffer = 1;
    private int id;

    public BankAccount()
    {
        this.id = id_buffer;
        id_buffer++;
    }

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
