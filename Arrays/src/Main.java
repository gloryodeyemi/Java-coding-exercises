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

//    public static int[] getIntegers(int size){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter " + size + " integers: \r");
//        int[] array = new int[size];
//        for (int i=0; i < array.length; i++){
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }

    public static void printArray(int[] array){
        System.out.println("The integers in the array are: ");
        for (int i = 1; i <= array.length; i++){
            System.out.println("Integer #" + i + " = " + array[i-1]);
        }
    }

//    public static void printArray(int[] array){
//        for (int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + " contents " + array[i]);
//        }
//    }

    public static int[] sortIntegers(int[] array){
        int[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);
        // code to reverse the sorted array
        int i = 0;
        int j = arrayCopy.length - 1;
        int tmp;
        while (j > i) {
            tmp = arrayCopy[j];
            arrayCopy[j] = arrayCopy[i];
            arrayCopy[i] = tmp;
            j--;
            i++;
        }
        return arrayCopy;
    }
}
