package day35_Encapsulation.BankAccountTask;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount bankAccount1 =new BankAccount("Ali Bayram","1234567891011121",150000);
        bankAccount1.withdraw(120000);
        bankAccount1.deposit(10000);

        bankAccount1.checkBalance();
    }
}
