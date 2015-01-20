package Eular;

/**
 * Created by Meth on 12/28/14.
 */
public class Problem34 {
    public static int factorial(int foo) {
        switch (foo) {
            case 1: return 1;
            case 2: return 2;
            case 3: return 6;
            case 4: return 24;
            case 5: return 120;
            case 6: return 720;
            case 7: return 5040;
            case 8: return 40320;
            case 9: return 362880;
            case 0: return 1;
        }
        return 1;
    }

    public static boolean sumEqual(int number) {
        String numberString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += factorial(Integer.parseInt(numberString.substring(i,i+1)));
            if (sum > number) {
                return false;
            }
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 3;
        int sum = 0;
        while (true) {
            if (sumEqual(number)) {
                sum += number;
                System.out.println(number);
                System.out.println("the current sum is:"+sum);
            }
            number++;
            if (number == Integer.MAX_VALUE) {
                break;
            }
            if (number % 9999999 == 0) {
                System.out.println(number);
            }
        }
    }
}
