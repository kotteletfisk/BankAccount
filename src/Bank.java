public class Bank
{

    public boolean transferMoney(BankAccount from, BankAccount to, double amount) throws NoSuchFuckeryException
    {
        if (from == null || to == null)
        {
            throw new NoSuchFuckeryException("Argument was null!");
        }

        if (amount > 0 && from.withdraw(amount))
        {
            to.deposit(amount);
            return true;
        }

        return false;
    }
}
