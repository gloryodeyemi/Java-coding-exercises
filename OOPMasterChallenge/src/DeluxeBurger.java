public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Bacon", 14.55, "Sesame Bun");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.80);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to a deluxe burger.");
    }
}
