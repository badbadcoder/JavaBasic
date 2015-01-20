package Eular;

import java.util.HashMap;

/**
 * Created by Meth on 12/20/14.
 */
public class Problem10SievePrime {
    public static void main(String[] args) {
        generateNonePrimes();
    }

    public static boolean[] generateNonePrimes() {
        int limit = 2000000;
        boolean[] number = new boolean[limit];
        number[0] = true;
        number[1] = true;

        for (int i = 2; i <= limit - 1; i++) {
            if (!number[i]) {
                for (int j = 2 * i; j <= limit - 1; j += i) {
                    number[j] = true;
                }
            }
        }
        return number;
    }
}
