package abstraction.bankaccount;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds in the account!");
        }
    }


    public void applyInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
    }

    private void setBalance(double v) {
    }
}
