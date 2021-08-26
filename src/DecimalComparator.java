public class DecimalComparator {

    public static void main(String[] args) {
        boolean result = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(result);
    }
    public static boolean areEqualByThreeDecimalPlaces(double one, double two){
        int a = (int) (one * 1000);
        int b = (int) (two * 1000);

        if (a - b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
