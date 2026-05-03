package Day7;

class BankAccount {
    String name;
    int accountNumber;
    double balance;

//  Constructor
    BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//  Amount Deposit Method
    public void deposit(double amount) {
    	if (amount <= 0) {
            System.out.println("\n❌ Invalid deposit!");
        } else {
            balance += amount;
            System.out.println("\n✅ Amount Credited : " + amount);
            System.out.println("Current Balance is :" + balance);
        }
    }

//  Amount Withdrawing Method
    public void withdraw(double amount) {
    	if (amount <= 0) {
            System.out.println("\n❌ Invalid withdrawal!");
        } else if (amount > balance) {
            System.out.println("\n❌ Insufficient balance!");
            System.out.println("Current Balance is : " + balance);
        } else {
            balance -= amount;
            System.out.println("\n✅ Amount Debited : " + amount);
            System.out.println("Current Balance is : " + balance);
        }
    }

//  Displaying Account Details Method 
    public void display() {
    	System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

//  Check Balance Method
	public void checkBalance() {
		System.out.println("\nName : " + name);
		System.out.println("Balance : " + balance);
	}
}
