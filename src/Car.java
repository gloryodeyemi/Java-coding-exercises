public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String color, String category, int wheels, int doors, int gears, boolean isManual) {
        super(color, category);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;

        this.currentGear = 1;
    }


    public void changeVelocity(int speed, int direction){
        System.out.println("Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Gear changed to " + this.currentGear + " gear.");
    }


}
