package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem4 {
    public static void main(String[] args) {
        int max = -1;
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                int result = i * j;
                if (result > max) {
                    if (FindPrime.isPalin(result)) {
                        max = result;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
