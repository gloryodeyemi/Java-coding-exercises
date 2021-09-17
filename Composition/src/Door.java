public class Door {
    private String color;
    private double width;
    private double height;
    private String type;
    private int doorLock;

    public Door(String color, double width, double height, String type) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.type = type;
    }

    public void doorAction(int doorLock){
        if (doorLock == 0){
            System.out.println("Door closed!");
        } else if (doorLock == 1){
            System.out.println("Door opened!");
        } else {
            System.out.println("Invalid command, try again!!!");
        }
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
}
