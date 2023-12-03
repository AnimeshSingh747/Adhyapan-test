public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited  ₹" + amount + ". New balance:  ₹" + balance);
        } else
            System.out.println("Invalid deposit amount. Please deposit a positive amount.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew  ₹" + amount + ". New balance:  ₹" + balance);
        } else
            System.out.println("Invalid withdrawal amount. Please enter a valid amount.");
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Initial balance: $" + account.getBalance());

        account.deposit(500);
        account.withdraw(200);
        account.withdraw(900);
        System.out.println("Current balance: $" + account.getBalance());
    }
}
