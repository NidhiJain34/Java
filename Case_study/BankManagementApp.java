import java.util.ArrayList;
import java.util.List;

// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Account Class
class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }

        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public void transfer(Account targetAccount, double amount) throws InsufficientFundsException {
        if (targetAccount == null) {
            System.out.println("Invalid target account.");
            return;
        }

        this.withdraw(amount);
        targetAccount.deposit(amount);
        System.out.println("Transferred " + amount + " to account " + targetAccount.getAccountNumber());
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

// Bank Class
class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.add(account);
        System.out.println("Account created successfully.");
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account account : accounts) {
                account.displayAccountDetails();
            }
        }
    }
}

// Main Class
public class BankManagementApp {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.createAccount("A101", "Nidhi", 5000);
        bank.createAccount("A102", "Rahul", 3000);

        Account acc1 = bank.getAccount("A101");
        Account acc2 = bank.getAccount("A102");

        try {
            acc1.deposit(2000);
            acc1.withdraw(1000);
            acc1.transfer(acc2, 2500);

            acc2.withdraw(10000); // This will throw exception

        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();
        bank.displayAllAccounts();
    }
}
