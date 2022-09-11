package banking;

public class Account {
    private int balance;
    private String bankName;
    private int accountNumber;

    public Account(int balance, String bankName, int accountNumber) {
        this.balance = balance;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    public void printAccount(){
        System.out.println("잔고 : " + balance + ", 계좌번호 : " + accountNumber + ", 은행이름 : " + bankName);
    }

    public void deposit(int amt){
        balance += amt;
    }

    public void withdraw(int amt){
        balance -= amt;
    }

    public int getBalance(){
        return balance;
    }
}
