package Day6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = null;

        int choice;

        do {
            System.out.println("\n------- BANK MENU -------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");

            System.out.println("\nEnter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    acc = BankAccount.createAccount(sc); // ✅ only here
                    break;

                case 2:
                    if (acc == null) {
                        System.out.println("❌ First create account!");
                    } else {
                        System.out.println("Enter deposit amount: ");
                        acc.deposit(sc.nextDouble());
                    }
                    break;

                case 3:
                    if (acc == null) {
                        System.out.println("❌ First create account!");
                    } else {
                        System.out.println("Enter withdrawal amount: ");
                        acc.withdraw(sc.nextDouble());
                    }
                    break;

                case 4:
                    if (acc == null) {
                        System.out.println("❌ First create account!");
                    } else {
                    	System.out.println("\nName : " + acc.getAccountHolder());
                        System.out.println("Balance: " + acc.getBalance());
                    }
                    break;

                case 5:
                    if (acc == null) {
                        System.out.println("❌ First create account!");
                    } else {
                        acc.displayDetails();
                    }
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}