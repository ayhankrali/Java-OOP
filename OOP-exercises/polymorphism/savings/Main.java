package polymorphism.savings;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA001", 5000.0, 0.05);
        BankAccount checkingAccount = new CheckingAccount("CA001", 3000.0, 1000.0);

        double withdrawalAmount = 4000.0;
        savingsAccount.withdraw(withdrawalAmount);
        checkingAccount.withdraw(withdrawalAmount);
    }

}
