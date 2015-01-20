package Eular;

/**
 * Created by Meth on 12/28/14.
 */
public class Problem30 {
    public static boolean sumEqual(int number) {
        String numberString = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < numberString.length(); i++) {
            sum += Math.pow(Integer.parseInt(numberString.substring(i,i+1)),5);
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
        int foo = 2;
        int sum = 0;
        while (true) {
            if (sumEqual(foo)) {
                System.out.println(foo);
                sum += foo;
                System.out.println("The sum so far is:"+sum);
            }
            foo++;
        }
    }
}
