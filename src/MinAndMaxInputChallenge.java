import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int count = 1;
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if (min > number){
                    min = number;
                }
                if (max < number ){
                    max = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle next line character (enter key)
        }
        System.out.println("The minimum number entered = " + min + " and the " +
                "maximum number entered = " + max);
        scanner.close();
    }
}
