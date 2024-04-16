import java.util.*;

class Bankaccount {
    private double balance;

    public Bankaccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

class ATM {
    private Bankaccount bankaccount;

    public ATM(Bankaccount bankAccount) {
        this.bankaccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
    }

    public void Transaction(int choice, Scanner sc) {
        switch (choice) {
            case 1:
                System.out.println("Current balance: " + bankaccount.getBalance());
                break;
            case 2:
                System.out.print("Enter Deposit amount: ");
                double depositamount = sc.nextDouble();
                bankaccount.deposit(depositamount);
                break;
            case 3:
                System.out.print("Enter withdrawal amount: ");
                double withdrawalAmount = sc.nextDouble();
                bankaccount.withdraw(withdrawalAmount);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice, Please select a valid option.");
        }
    }
}

public class ATM_interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial account balance: ");
        double initialBalance = sc.nextDouble();
        Bankaccount bankAccount = new Bankaccount(initialBalance);

        ATM atm = new ATM(bankAccount);

        while (true) {
            atm.displayMenu();
            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            atm.Transaction(choice, sc);
        }
    }
    
}
