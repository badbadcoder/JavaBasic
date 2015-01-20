package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem1 {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 3; i < 1000; i++) {
            boolean score = false;
            if (i % 3 == 0) {
                score = true;
            }
            if (i % 5 == 0) {
                score = true;
            }
            if (score) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
