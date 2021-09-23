import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getIntegers();
        printArray(array);
        int[] array2 = sortIntegers(array);
        printArray(array2);
    }

    public static int[] getIntegers(){
        System.out.println("Enter the number of integers you want in the array: ");
        int num = scanner.nextInt();
        System.out.println("Enter " + num + " integers: \r");
        int[] array = new int[num];
        for (int i=0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println("The integers in the array are: ");
        for (int i = 1; i <= array.length; i++){
            System.out.println("Integer #" + i + " = " + array[i-1]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);
//        System.out.println(arrayCopy);
        return arrayCopy;
    }
}
