public class Main {

    public static void main(String[] args) {
        // Simple Calculator
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        System.out.println("---------------------------");

        // Person
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        System.out.println("---------------------------");

        // Bank account class
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber("0252227713");
        bankAccount.setBalance(5000.0d);
        bankAccount.setCustomerName("Jim Johnson");
        bankAccount.setCustomerEmail("jim@gmail.com");
        bankAccount.setCustomerPhoneNumber("09010000000");
        System.out.println("Customer Name = " + bankAccount.getCustomerName());
        System.out.println("Customer Email = " + bankAccount.getCustomerEmail());
        System.out.println("Customer Phone number = " + bankAccount.getCustomerPhoneNumber());
        System.out.println("Account Number = " + bankAccount.getAccountNumber());
        System.out.println("Balance = " + bankAccount.getBalance());
        bankAccount.depositFunds(8000.0d);
        bankAccount.withdrawFunds(6000.0d);
        bankAccount.withdrawFunds(9000.0d);
        System.out.println("---------------------------");

        // VIP Customer
        VipCustomer customer1 = new VipCustomer("Jimmy John", 10000.0d,
                "jimmy@john.com");
        System.out.println("Name = " + customer1.getName());
        System.out.println("---------------------------");

        VipCustomer customer2 = new VipCustomer("James Bryan", 10000.0d);
        System.out.println("Email address = " + customer2.getEmailAddress());
        System.out.println("---------------------------");

        VipCustomer customer3 = new VipCustomer();
        System.out.println("Credit limit = " + customer3.getCreditLimit());
        System.out.println("---------------------------");
    }
}
