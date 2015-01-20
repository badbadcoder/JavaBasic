package Eular;

import java.util.Arrays;
import java.util.Stack;

/**
 * Created by Meth on 12/16/14.
 */
public class test {

    public static void printPermu(int n) {
        addPrefix("",n);
    }

    public static void addPrefix(String prefix, int n) {
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 1; i <= n; i++) {
                addPrefix(prefix + i, n-1);
            }
        }
    }

    public static void main(String[] args) {
        printPermu(3);
    }

    public static int[] check(int[] input) {
        int zeroIndex = 0;
        int oneIndex = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                if (zeroIndex == oneIndex) {
                    zeroIndex++;
                    oneIndex++;
                } else {
                    input[i] = 1;
                    input[zeroIndex++] = 0;
                    oneIndex++;
                }
            } else {
                oneIndex++;
            }
        }
        return input;
    }
}
