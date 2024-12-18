package BankAccount;

public class Bank_Account {

    private long AccountNumber;
    private String AccountName;
    private float AccountBalance;


    public void deposit(float amt){
        if(amt >0){
            AccountBalance = AccountBalance+ amt;
            System.out.println("Successfully Deposited $" + amt );
        } else {
            System.out.println("Can not process your payment $ " + amt);
        }

    }

    public void withDraw( float amt){

        if(amt > 0){
            AccountBalance = AccountBalance - amt;
            System.out.println("Successfully withdraw $" + amt );
        } else {
            System.out.println("Can not process your payment $ " + amt);
        }


    }

    public void DisplayBalance(){

        System.out.println(" your current Balance is $ :" + AccountBalance);

    }

    public Bank_Account(long accountNumber, String accountName, float accountBalance) {
        AccountNumber = accountNumber;
        AccountName = accountName;
        AccountBalance = accountBalance;
    }
}
