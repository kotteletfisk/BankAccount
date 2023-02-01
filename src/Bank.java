public class Bank
{

    public boolean transferMoney(BankAccount from, BankAccount to, double amount)
    {
        if (amount > 0 && from.withdraw(amount))
        {
            to.deposit(amount);
            return true;
        }

        return false;
    }
}
