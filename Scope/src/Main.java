import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        X x = new X();

        System.out.print("Enter an integer: ");
        x.x(scanner.nextInt());
    }
}
