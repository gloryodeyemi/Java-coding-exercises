public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerNumber) {
        this.customerName = customerNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void depositFunds(double amount){
        this.balance += amount;
        System.out.println("Deposit Successful! Bank account balance = " + this.balance);
    }

    public void withdrawFunds(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient Balance!");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw Successful! Your remaining balance = " + this.balance);
        }
    }
}
