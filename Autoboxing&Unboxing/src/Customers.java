import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

//    public void printCustomers(){
//        System.out.println("Customer name: " +this.name +"\n" +
//                "Customer transactions: "+this.transactions);
//    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
