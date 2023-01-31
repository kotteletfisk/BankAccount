import java.util.ArrayList;

public class Customer
{
    private String name;

    private Status status;

    private int id;

    ArrayList<BankAccount> accounts;

    public void addAccount(BankAccount account) {

        accounts.add(account);

    }

    public void remove(BankAccount account) {
        accounts.remove(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }
}
