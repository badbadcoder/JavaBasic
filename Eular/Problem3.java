package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem3 {
    public static void main(String[] args) {
        long foo = 600851475143L;

        for (int i = 1; ; i++) {
            if (foo % i == 0) {
                if (FindPrime.isPrime(foo / i)) {
                    System.out.println(foo / i);
                    break;
                }
            }
        }

    }
}
