package BankAccount;

public class Bank_AccountMain {
    public static void main(String[] args) {
        Bank_Account B1= new Bank_Account(12485687,"shiva",754.5f);
        B1.deposit(8);
       B1.withDraw(200);
        B1.DisplayBalance();
    }
}
