package n2exercice1;

public class BankAccount {

    private String accountHolderName;
    private int balance;

    public BankAccount (String accountHolderName, int balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Name: " + this.accountHolderName + ", total balance: " + this.balance;
    }
}
