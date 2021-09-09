public class FlourPacker {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(4, 18, 19));
        System.out.println(canPack(6, 2, 17));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = (bigCount * 5) + smallCount;
        if (sum < goal){
            return false;
        }
        return ((goal % 5) <= smallCount);
        /* if (sum >= goal) {
            if ((bigCount * 5) > goal) {
                if ((bigCount * 5) % goal == 0){
                    return true;
                } else if ((((bigCount * 5) / goal) + smallCount) >= goal){
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
        */
    }
}
