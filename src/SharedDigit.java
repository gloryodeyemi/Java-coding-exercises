public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(123,33));
    }
        private static boolean hasSharedDigit (int a, int b){
            if(a>9 && a<100 && b>9 && b<100){
                String aString = Integer.toString(a);
                String bString = Integer.toString(b);
                for(int i=0; i<aString.length();i++){

                    if(bString.contains(String.valueOf(aString.charAt(i)))){
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

}
