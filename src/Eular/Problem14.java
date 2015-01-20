package Eular;

/**
 * Created by Meth on 12/23/14.
 */
public class Problem14 {
    public static int next(long foo) {
        int chainLength = 0;
        while (foo != 1) {
            if (foo % 2 == 0) {
                foo = foo / 2;
                chainLength++;
            } else {
                foo = foo * 3 + 1;
                chainLength++;
            }
        }
        return ++chainLength;
    }

    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        int maxNumber = 0;
        int maxLength = 1;
        for (int i = 999999; i>=1; i -= 2) {
            int number = next(i);
            if (number > maxLength) {
                maxNumber = i;
                maxLength = number;
            }
        }
        System.out.println(maxNumber);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
