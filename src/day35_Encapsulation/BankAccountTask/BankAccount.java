package day35_Encapsulation.BankAccountTask;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;//bakiye

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length()!=16){
            System.out.println("Invalid accountNumber  ");
            System.exit(0);
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
    public double deposit(double amount){
        if (amount <= 0) {
            System.out.println("Depositing amount can not be negative or zero");
            System.exit(0);
        }

        System.out.println("Deposited $"+amount+" to the account "+accountNumber);
        return balance+=amount;
    }

    public double withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient balance");
            System.exit(0);
        }
        if (amount <= 0) {
            System.out.println("Withdrawing amount can not be negative or zero");
            System.exit(0);
        }

        System.out.println("Withdrawed $"+amount+" from the account "+accountNumber);
        return balance-=amount;

    }
    public void checkBalance(){
        System.out.println("balance : "+balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
/*
create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments


 */