package Java_Development_internship;

import java.util.Scanner;

// BankAccount class to manage balance
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return "Deposit successful! New balance: $" + balance;
        }
        return "Invalid deposit amount.";
    }

    public String withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return "Withdrawal successful! New balance: $" + balance;
        } else if (amount > balance) {
            return "Insufficient balance!";
        }
        return "Invalid withdrawal amount.";
    }
}

// ATM class for user interaction
class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.println(account.deposit(depositAmount));
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.println(account.withdraw(withdrawAmount));
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Have a Great Day!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

// Main class to run the ATM program
public class ATMSimulator {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance: $1000
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
