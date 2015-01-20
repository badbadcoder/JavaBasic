package Eular;

/**
 * Created by Meth on 12/31/14.
 */
public class Problem47 {
    static boolean[] nonePrimes = Problem10SievePrime.generateNonePrimes();

    public static void main(String[] args) {

        long time1 = System.currentTimeMillis();

        long number = 1;
        boolean notFound = true;

        NextNumber:
        while (notFound) {
            for (int shift = 0; shift <= 3; shift ++) {
                if (numberOfPrimes2(number + shift) != 4) {
                    number++;
                    continue NextNumber;
                }
            }
            notFound = false;
            System.out.println(number);
        }
        long time2 = System.currentTimeMillis();
        long time = (time2 - time1) / 1000;
        System.out.println(time);




//        boolean notFound = true;
//        long foo = 1;
//
//        while (notFound) {
//            boolean notI = false;
//            Eular.Number[] numbers = new Eular.Number[4];
//            for (int i = 0; i <= 3; i++) {
//                numbers[i] = new Eular.Number(foo + i);
//                numbers[i].findPrime();
//                if (!numbers[i].isFour) {
//                    notI = true;
//                    break;
//                }
//            }
//            if (!notI) {
//                System.out.println("found! " + foo);
//                notFound = false;
//            } else {
//                foo++;
//                if (foo % 1000 == 0) {
//                    System.out.println(foo);
//                }
//            }
//
//        }
    }

    static int numberOfPrimes2(long number) {
        int foo = 0;

        for (int i = 2; i <= number; i++) {
            if (!nonePrimes[i] && number % i == 0) {
                foo++;
            }
        }
        return foo;
    }


    static int numberOfPrimes(long number) {
        int foo = 0;
        for (int i = 2; i <= number; i++) {
            if (FindPrime.isPrime(i) && number % i == 0) {
                foo++;
            }
        }
        return foo;
    }
}

class Number {
    long value;
    int numberOfPrime;
    boolean isFour;

    Number (long foo) {
        value = foo;
        numberOfPrime = 0;
        isFour = false;
    }

    void findPrime() {
        long foo = value;
        for (long i = 2; i <= value; i++) {
            if (FindPrime.isPrime(i) && foo % i == 0) {
                if (numberOfPrime == 5) {
                    return;
                }
                foo /= i;
                numberOfPrime++;
                }
            }
        if(numberOfPrime == 4) {
            isFour = true;
        }
    }
}