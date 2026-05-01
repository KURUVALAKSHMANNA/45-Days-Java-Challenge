package Day6;

import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accNumber;
        this.balance = balance;
    }

    public static BankAccount createAccount(Scanner sc) {
        sc.nextLine(); // clear buffer

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.println("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.println("\n✅ Account Created Successfully!");

        return new BankAccount(name, accNo, balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("\n❌ Invalid deposit!");
        } else {
            balance += amount;
            System.out.println("\n✅ Amount Credited : " + amount);
            System.out.println("Current Balance is :" + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("\n❌ Invalid withdrawal!");
        } else if (amount > balance) {
            System.out.println("\n❌ Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("\n✅ Amount Debited : " + amount);
            System.out.println("Current Balance is : " + balance);
        }
    }

    public void displayDetails() {
        System.out.println("\n----- ACCOUNT DETAILS -----\n");
        System.out.println("Name: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}