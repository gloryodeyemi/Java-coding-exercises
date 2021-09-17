public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Bob Bryce", 5000.0d, "bob@bryce.com");
        System.out.println("Empty constructor called!");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "bob@bryce.com");
        this.name = name;
        this.creditLimit = creditLimit;
        System.out.println("Constructor with two parameters called!");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Constructor with all parameters called!");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
