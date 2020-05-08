public class FlourPacker {
    public static void main(String[] args) {
        System.out.println (canPack(-3,2,12 ));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if ((bigCount < 0)|(smallCount < 0)|(goal < 0)) return false;

        if ((smallCount > 0)&(bigCount == 0)) {
            if (smallCount >= goal) return true;
            return false;
        }
        int bigkg = bigCount * 5;
        if (bigkg > goal) return false;
        int temp1 = goal / 5;
        if (temp1 <= 1){
            if (smallCount >= goal) return true;
            int temp4 = goal - 5;
            if (temp4 <= smallCount) return true;
            return false;
        }
        else {
            if (goal > bigkg){
                int temp2 = goal - bigkg;
                if (temp2 <= smallCount) return true;
                return false;
            }
            else {
                int temp3 = goal - temp1*5;
                if (temp3 <= smallCount) return true;
                else return false;
            }
        }
    //return false;
    }
}


