package Day7;

class CurrentAccount extends BankAccount {

    String businessName;

    CurrentAccount(String name, int accountNumber, long phone, long aadhaar, double balance, String businessName) {
        super(name, accountNumber, balance);
        this.businessName = businessName;
    }

    @Override
    public void display() {
        System.out.println("Account Type: Current");
        System.out.println("Business Name: " + businessName);
        super.display();
    }
}