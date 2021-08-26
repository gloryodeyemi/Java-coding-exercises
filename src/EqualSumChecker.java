public class EqualSumChecker {
    public static void main(String[] args) {
        boolean result = hasEqualSum(1, -1, 0);
        System.out.println(result);
    }
    public static boolean hasEqualSum(int a, int b, int c){

        if ((a + b) == c){
            return true;
        } else {
            return false;
        }
    }
}
