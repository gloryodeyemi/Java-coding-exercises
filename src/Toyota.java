public class Toyota extends Car{
    private int roadServiceMonths;

    public Toyota(int roadServiceMonths) {
        super("Blue", "Toyota", 4, 4, 5, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
