package polymorphism.savings;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void withdraw(double amount) {
        double balance = getBalance();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from savings account. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient funds in savings account.");
        }
    }
}
