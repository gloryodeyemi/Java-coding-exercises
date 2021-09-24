import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = new int[] {20,47,18,48,29};
        System.out.println("The original array = " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("The reversed array = " + Arrays.toString(array));
    }

    private static void reverseArray(int[] array){
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
    }
}
/*
-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name ÅeReverseArrayChallengeÅf
 */
