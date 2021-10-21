
public class Main {
    public static void main(String[] args) {
//        System.out.print("Enter the customer name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter the transaction: ");
//        double transaction = scanner.nextDouble();
//        transactionList.add(transaction);
//
//        Customers customer1 = new Customers(name,transactionList);
//        customersList.add(customer1);
//        customer1.printCustomers();
//
//        Branches branch = new Branches(customersList);
//        branch.addCustomer(customer1);
//        branch.addTransaction("Glory", 47.9);

        Bank bank = new Bank("Guaranty Trust Bank");

        bank.addBranch("Ikoyi");

        bank.addCustomer("Ikoyi", "Glory", 50.05);
        bank.addCustomer("Ikoyi", "Blessing", 175.34);
        bank.addCustomer("Ikoyi", "Damilola", 220.12);

//        bank.addBranch("Ikeja");
//        bank.addCustomer("Ikeja", "Tosin", 150.54);

        bank.addCustomerTransaction("Ikoyi", "Glory", 44.22);
        bank.addCustomerTransaction("Ikoyi", "Glory", 12.44);
        bank.addCustomerTransaction("Ikoyi", "Blessing", 1.65);

        bank.listCustomers("Ikoyi", true);


        bank.listCustomers("Ikeja", true);
//
//        if (!bank.addCustomer("Yaba", "Moyin", 5.53)){
//            System.out.println("Error Yaba branch does not exist!");
//        }
//
//        if (!bank.addBranch("Ikoyi")){
//            System.out.println("Ikoyi branch already exists!");
//        }
//
//        if (!bank.addCustomerTransaction("Ikoyi", "Bolu", 52.33)){
//            System.out.println("Customer does not exist at branch!");
//        }
//
//        if (!bank.addCustomer("Ikoyi", "Glory", 12.21)){
//            System.out.println("Customer Glory already exists!");
//        }
    }
}
