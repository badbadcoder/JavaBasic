package Eular;

/**
 * Created by Meth on 12/20/14.
 */
public class Problem10 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        long sum = 2;
        for (int i = 3; i < 2000000; i++) {
            if (FindPrime.isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
