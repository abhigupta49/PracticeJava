package inheritance;

public class SavingsAccount extends BankAccount{

    @Override
    public void withdrawCash(int drawCash) {
        int currBalance = super.getBalance();
        if(currBalance<drawCash || (drawCash<100)){
            System.out.println("Don't have balance greater than 100!! please deposit");
        }else{
            super.withdrawCash(drawCash);
        }

    }
}
