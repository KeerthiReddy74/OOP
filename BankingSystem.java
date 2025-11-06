package co2_scena;

abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }

    abstract double calculateInterest();

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Getter so child classes can access balance safely
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String acc, double bal) {
        super(acc, bal);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, double bal) {
        super(acc, bal);
    }

    @Override
    double calculateInterest() {
        return getBalance() * 0.01; // 1% interest
    }
}
public class BankingSystem {
	 public static void main(String[] args) {
	        BankAccount s = new SavingsAccount("SA101", 5000);
	        s.deposit(2000);
	        s.withdraw(1000);
	        System.out.println("Savings Interest: ₹" + s.calculateInterest());

	        System.out.println();

	        BankAccount c = new CurrentAccount("CA201", 8000);
	        c.deposit(1000);
	        c.withdraw(500);
	        System.out.println("Current Interest: ₹" + c.calculateInterest());
	    }
}
