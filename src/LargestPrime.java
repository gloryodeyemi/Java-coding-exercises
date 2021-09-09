public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number){

        if (number < 2){
            return -1;
        }

        for (int i=2; i <= number/2; i++){
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
        return number;
    }
    /*
    public class LargestPrime {
    // write your code here
    public static int getLargestPrime(int number){

        if (number &lt; 2){
            return -1;
        }

        for (int i=2; i &lt;= number/2; i++){
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
        return number;
    }
}
     */
}
