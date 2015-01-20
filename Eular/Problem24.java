package Eular;

/**
 * Created by Meth on 12/28/14.
 */
public class Problem24 {
    public static void main(String[] args) {
        int[] number = {0};
        permutation("","0123456789", number);
    }

    public static void permutation(String prefix, String numbers, int[] time) {
        if (numbers.length() == 0) {
            time[0] ++;
            if (time[0] == 1000000) {
                System.out.println();
                return;
            }
        } else {
            for (int i = 0; i < numbers.length(); i++) {
                permutation(prefix + numbers.charAt(i),numbers.substring(0, i)+numbers.substring(i+1), time);
            }
        }

    }
}
