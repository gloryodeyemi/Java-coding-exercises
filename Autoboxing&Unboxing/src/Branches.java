import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customers> customers;

    public Branches(String name) {
        this.name = name;
        this.customers  = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null){
            this.customers.add(new Customers(customerName, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customers existingCustomer = findCustomer(customerName);
        if (existingCustomer!= null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    private Customers findCustomer(String customerName){
        for (int i=0; i<this.customers.size(); i++){
            Customers checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }

//    public void addCustomer(Customers customer){
//        for (int i=0; i<customers.size(); i++) {
//            if (customers.get(i).equals(customer.getName())) {
//                System.out.println("Customer already exist!");
//            }
//        }
//        customers.add(customer);
//    }
//
//    public void addTransaction (String customerName, double transaction){
//        for (int i=0; i<customers.size(); i++){
//            if (customers.get(i).equals(customerName)){
//                if (customers.get(i).equals(transaction)){
//                    System.out.println("Transaction already exist!");
//                } else {
//                    customers.get(i).transactions.add(transaction);
//                }
//            }
//        }
//    }
}
