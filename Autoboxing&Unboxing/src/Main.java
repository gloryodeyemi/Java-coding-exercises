import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Double> transactionList = new ArrayList<Double>();
    public static ArrayList<Customers> customersList = new ArrayList<Customers>();
    public static void main(String[] args) {
        System.out.print("Enter the customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the transaction: ");
        double transaction = scanner.nextDouble();
        transactionList.add(transaction);

        Customers customer1 = new Customers(name,transactionList);
        customersList.add(customer1);
        customer1.printCustomers();

        Branches branch = new Branches(customersList);
        branch.addCustomer(customer1);
        branch.addTransaction("Glory", 47.9);
    }
}
