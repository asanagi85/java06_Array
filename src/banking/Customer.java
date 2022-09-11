package banking;

public class Customer {
    private String name; //생성자 주입
    private Account[] accounts; //setter주입

    public Customer(String name) {
        this.name = name;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }
}
