package Eular;

import java.math.BigInteger;

/**
 * Created by Meth on 12/28/14.
 */
public class Problem25 {
    public static void main(String[] args) {
        BigInteger a1 = BigInteger.ONE;
        BigInteger a2 = BigInteger.ONE;
        BigInteger a3;
        int index = 2;
        boolean notReached = true;
        while (notReached) {
            a3 = a1.add(a2);
            index++;
            if (a3.toString().length() == 1000) {
                notReached = false;
                System.out.println(index);
            }
            a1 = a2;
            a2 = a3;
        }
    }
}
