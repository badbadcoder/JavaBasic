package Eular;

/**
 * Created by Meth on 12/16/14.
 */
public class FindPrime {
    public static void main(String[] args) {
        int i = 99999;

        for (int num = 1 ; i >= 1 ; num += 2) {
            if (isPrime(num)) {
                if (isPrime(reversedNumber(num))) {
                    if (!isPalin(num)) {
                        i--;
                        printNum(num,i);
                    }
                }
            }
        }
    }

    public static void printNum(int num,int i) {
        if (i % 10 == 0) {
            System.out.printf("%10d\n", num);
        } else {
            System.out.printf("%10d", num);
        }
    }
    public static boolean isPrime(long num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer reversedNumber(int foo) {
        String stringFoo = Integer.toString(foo);
        String reversedFoo =  new StringBuilder(stringFoo).reverse().toString();
        return Integer.parseInt(reversedFoo);
    }

    public static boolean isPalin(long num) {

        String numString = Long.toString(num);
        String reversedNum = new StringBuilder(numString).reverse().toString();

        return numString.equals(reversedNum);
    }
}
