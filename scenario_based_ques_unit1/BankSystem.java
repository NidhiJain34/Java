


class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("ACC123", 5000);

        acc.display();

        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println();
        acc.display();
    }
}
