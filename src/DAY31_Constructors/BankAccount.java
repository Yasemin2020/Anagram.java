package DAY31_Constructors;

public class BankAccount {
    public String accounHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber){
        this.accounHolder=accountHolder;
        this.accountNumber=accountNumber;

    }

    public String toString() {
        return "BankAccount{" +
                "accounHolder='" + accounHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println("Your available balance is: $"+ balance);
    }

    public void deposit(double amount){
        if(amount<0){
            System.out.println("Depositing amount cannot be zero or nagative");
            return;//exits the method
        }
        balance+=amount;

    }

    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        if(amount <=0){
            System.out.println("Withdrawing amount cannot be negative or zero");
            return;
        }

        balance -=amount;
    }





}
