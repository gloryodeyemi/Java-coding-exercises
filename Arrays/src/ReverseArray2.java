import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] array = new int[]{20, 47, 18, 48, 29};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        // code to reverse the array
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
/*
Write a method called reverse() with an int array as a parameter.

The method should not return any value. In other words, the method is allowed to modify the array parameter.

To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].

The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]

and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]

TIP: When swapping the elements, use a variable to temporarily hold the current element.

NOTE: The method should be defined as private static.

NOTE: Do not add a main method to the solution code.
 */

