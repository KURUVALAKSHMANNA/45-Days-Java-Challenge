package Day7;

class SavingsAccount extends BankAccount {

    SavingsAccount(String name, int accountNumber, long phone, long aadhaar, double balance) {
        super(name, accountNumber, balance);
    }

    @Override
    public void display() {
        System.out.println("Account Type: Savings");
        super.display();
    }
}