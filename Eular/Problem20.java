package Eular;

import java.math.BigInteger;

/**
 * Created by Meth on 12/27/14.
 */
public class Problem20 {
    public static void main(String[] args) {
        int base = 100;
        BigInteger answer = calculate(base);
        String resultString = answer.toString();
        long sum = 0;
        for (int i = 0; i < resultString.length(); i++) {
            sum += Integer.parseInt(resultString.substring(i ,i+1));
        }
        System.out.println(sum);
    }

    public static BigInteger calculate(int base) {
        if (base == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(base).multiply(calculate(base - 1));
        }
    }
}
