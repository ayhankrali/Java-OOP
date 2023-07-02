package polymorphism.savings;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        double overdraftLimit = getOverdraftLimit();
        double availableFunds = balance + overdraftLimit;

        if (availableFunds >= amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                overdraftLimit -= (amount - balance);
                balance = 0;
            }
            System.out.println("Withdrawn $" + amount + " from checking account. Remaining balance: $" + balance + " (Overdraft Limit: $" + overdraftLimit + ")");
        } else {
            System.out.println("Insufficient funds in checking account.");
        }
    }
}
