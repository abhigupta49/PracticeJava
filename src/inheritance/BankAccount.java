package inheritance;

public class BankAccount {
    private int balance;

    public BankAccount(){
        this.balance = 0;
    }

    public void deposit(int cashDeposit){
        this.balance = cashDeposit;
    }

    public void withdrawCash(int drawCash){
        this.balance -= drawCash;
    }

    public int getBalance(){
        return balance;
    }
}
