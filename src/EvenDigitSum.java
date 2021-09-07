public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        do{
            int digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
            }
            number = number / 10;
        } while(number > 0);

        return sum;
    }
}
