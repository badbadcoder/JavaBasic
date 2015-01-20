package Eular;

/**
 * Created by Meth on 12/23/14.
 */
public class Problem12 {
    public static void main(String[] args) {
        long number = 0;
        for (int i = 1, j = 0; j == 0 ; i++) {
            number += i;
            if (numberOfDivisors(number) >= 500) {
                j = 1;
            }
            System.out.println(number);
            System.out.println(numberOfDivisors(number));
        }
    }

    public static int numberOfDivisors(long foo) {
        int number = 0;
        for (int bar = 1; bar <= Math.sqrt(foo); bar++) {
            if (foo % bar == 0) {
                number++;
            }
        }
        number *= 2;
        if (foo == Math.pow((int)Math.sqrt(foo),2)) {
            number -= 1;
        }
        return number;
    }
}
