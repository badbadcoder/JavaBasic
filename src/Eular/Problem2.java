package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem2 {
    public static void main(String[] args) {
        long total = 2;

        for (int i = 1, j = 2; i <= 4000000; ) {
            int k = i + j;
            if (k % 2 == 0) {
                total += k;
            }
            i = j;
            j = k;
            System.out.println(k);
        }
        System.out.println(total);
    }
}
