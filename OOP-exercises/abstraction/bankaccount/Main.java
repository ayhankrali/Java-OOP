package abstraction.bankaccount;

public class Main {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SA-123456", 1000.0, 0.05);
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);
        ((SavingsAccount) savingsAccount).applyInterest();
        savingsAccount.displayAccountInfo();

        BankAccount checkingAccount = new CheckingAccount("CA-789012", 2000.0, 500.0);
        checkingAccount.deposit(1000.0);
        checkingAccount.withdraw(3000.0);
        checkingAccount.displayAccountInfo();

    }
}
