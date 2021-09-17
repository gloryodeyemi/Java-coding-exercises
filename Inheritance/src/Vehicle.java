public class Vehicle {
    private String color;
    private String category;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String color, String category) {
        this.color = color;
        this.category = category;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle is steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle is moving at " + currentVelocity + " in direction " +
                currentDirection + " degrees.");
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
