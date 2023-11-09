package entities;

public class BankAccount {
    private String titular;
    private int nmrAccount;
    private double balance;

    public BankAccount(String titular, int nmrAccount) {
        this.titular = titular;
        this.nmrAccount = nmrAccount;
    }

    public BankAccount(String titular, int nmrAccount, double initialDeposit) {
        this.titular = titular;
        this.nmrAccount = nmrAccount;
        addBalance(initialDeposit);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNmrAccount() {
        return nmrAccount;
    }

    public double getBalance() {
        return balance;
    }
    public void addBalance(double quantity){
        balance += quantity;
    }
    public void withdrawBalance(double quantity){
        balance -= quantity + 5;
    }
    public String toString(){
        return "Updated account data: "
                + "Account: "
                + nmrAccount
                + ", Holder: "
                + titular
                + ", Balance: $"
                + balance;
    }


}
