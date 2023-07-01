package inheritance.bank;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("1234567890", 1000);
        account1.deposit(500);
        account1.withdraw(200);
        account1.displayAccountInfo();

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount("0987654321", 2000, 5);
        savingsAccount.deposit(1000);
        savingsAccount.calculateInterest();
        savingsAccount.displayAccountInfo();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount("2468135790", 3000, 1000);
        currentAccount.deposit(2000);
        currentAccount.withdraw(5000);
        currentAccount.displayAccountInfo();
    }

}
