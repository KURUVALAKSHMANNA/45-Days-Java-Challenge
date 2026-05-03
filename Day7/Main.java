package Day7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n------ Bank System ------");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Exit");

            System.out.println("\nEnter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

//          ACCOUNT CREATION 
            if (choice == 1) {
                System.out.println("\nEnter Account Holder  Name : ");
                String name = sc.nextLine();
                
                System.out.println("Enter mobile number : ");
                long phone = sc.nextLong();
                
                System.out.println("Enter Adhaar Number : ");
                long aadhaar = sc.nextLong();

                System.out.println("Enter Account Number : ");
                int accNo = sc.nextInt();

                System.out.println("Enter Initial Deposit Amount : ");
                double balance = sc.nextDouble();

                account = new SavingsAccount(name, accNo, phone, aadhaar, balance);
                System.out.println("\nSavings Account Created Successfully!");
                account.display();
                System.out.println("Thank you for Creating.");

                
            } else if (choice == 2) {

                System.out.println("Enter Account Holder Name : ");
                String name = sc.nextLine();
                
                System.out.println("Enter mobile number :"); 
                long phone = sc.nextLong();
                
                System.out.println("Enter Aadhaar Number : ");
                long aadhaar = sc.nextLong();

                System.out.println("Enter Account Number : ");
                int accNo = sc.nextInt();

                System.out.println("Enter Initial Deposit Amount : ");
                double balance = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter Business Name : ");
                String business = sc.nextLine();

                account = new CurrentAccount(name, accNo,phone, aadhaar, balance, business);
                System.out.println("\nCurrent Account Created Successfully!");
                account.display();
                System.out.println("Thank you for Creating.");

                
            } else if (choice == 3) {
                System.out.println("Exist...!");
                break;
            } else {
                System.out.println("Invalid choice!");
                continue;
            }

//          SECOND MENU (after account creation)
            while (true) {
                System.out.println("\n--- Account Menu ---");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. View Account Details");
                System.out.println("5. Exit");

                System.out.println("\nEnter choice: ");
                int op = sc.nextInt();

                switch (op) {
                    case 1:
                        System.out.println("Enter Amount to deposit : ");
                        double dep = sc.nextDouble();
                        account.deposit(dep);
                        break;

                    case 2:
                        System.out.println("Enter Amount to withdraw : ");
                        double wd = sc.nextDouble();
                        account.withdraw(wd);
                        break;

                    case 3:
                        account.checkBalance();
                        break;

                    case 4:
                        account.display();
                        break;

                    case 5:
                        System.out.println("Going back to Home...");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

                if (op == 5) break;
            }
        }
        
        sc.close();
    }
}
