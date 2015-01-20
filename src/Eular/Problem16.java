package Eular;

import java.math.BigInteger;

/**
 * Created by Meth on 12/27/14.
 */
public class Problem16 {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ONE.add(BigInteger.ONE).pow(1000);
        System.out.println(result);
        String resultString = result.toString();
        long answer = 0;

        for (int i = 0; i < resultString.length(); i++) {
            answer += Integer.parseInt(resultString.substring(i ,i+1));
        }
        System.out.println(answer);
    }

    public static long sumOfLong(long number) {
        String resultString = Long.toString(number);
        long answer = 0;
        for (int i = 0; i < resultString.length(); i++) {
            answer += Integer.parseInt(resultString.substring(i ,i+1));
        }
        return answer;
    }
}
