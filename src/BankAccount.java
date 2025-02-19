/*Create a class BankAccount with members AcctNo, balance, and AcctType.
Implement the following operations:
Deposit an amount of 10,000.
Withdraw an amount of 5,000.
Display account details.
 */
public class BankAccount{
    private int AcctNo;
    private double balance;
    private String AcctType;

    public BankAccount(int AcctNo, double balance, String AcctType){
        this.AcctNo = AcctNo;
        this.balance = balance;
        this.AcctType = AcctType;
    }
    public BankAccount(){
        this.AcctNo = 567712;
        this.balance = 10000;
        this.AcctType = "Checking";
    }

    public void deposit(double amount){
        balance = balance + amount;
        display();
    }
    public void withdraw (double amount){
        if (balance > amount){
            balance = balance - amount;
            display();
        }
        else
            System.out.println("\nInsufficient Balance; Cannot withdraw "+amount+" as current balance is: "+balance );

    }
    public void display(){
        System.out.println("\n*****Banking.Account Summary*****");
        System.out.println("Banking.Account Number: "+AcctNo);
        System.out.println("Banking.Account type: "+ AcctType);
        System.out.println("Current Balance: "+ balance);

    }
    public static void main (String[] args){
        BankAccount o1 = new BankAccount(54756, 4500.56, "Savings");
        o1.display();
        o1.deposit(34000);
        o1.withdraw(90000);
    }
}