package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem7FindPrime {
    public static void main(String[] args) {
        int num = 1;
        int numberOfprime = 1;
        while (numberOfprime <= 10001) {
            num++;
            if (FindPrime.isPrime(num)) {
                numberOfprime++;
            }
        }
        System.out.println(num);
    }
}
