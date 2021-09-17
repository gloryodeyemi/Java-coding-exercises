import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // VIP Customer
        VipCustomer customer1 = new VipCustomer("Jimmy John", 10000.0d,
                "jimmy@john.com");
        System.out.println("Name = " + customer1.getName());
        System.out.println("---------------------------");

        VipCustomer customer2 = new VipCustomer("James Bryan", 10000.0d);
        System.out.println("Email address = " + customer2.getEmailAddress());
        System.out.println("---------------------------");

        VipCustomer customer3 = new VipCustomer();
        System.out.println("Credit limit = " + customer3.getCreditLimit());
        System.out.println("---------------------------");

        // Wall Area
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("---------------------------");

        // Point
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        System.out.println("---------------------------");

        // Floor, Carpet, and Calculator
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator1 = new Calculator(floor, carpet);
        System.out.println("total= " + calculator1.getTotalCost());
        System.out.println("---------------------------");

        // Complex Number
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        System.out.println("---------------------------");
    }
}
