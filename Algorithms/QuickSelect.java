package Algorithms;

import java.util.Arrays;

/**
 * Created by Meth on 1/19/15.
 */
public class QuickSelect {


    public static void quickSelect(int[] list, int lowIndex, int highIndex, int j) {
        if (j > list.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        int pivotIndex = (int) (Math.random() * list.length);
        int foo = list[pivotIndex];
        list[pivotIndex] = list[list.length - 1];
        list[list.length - 1] = foo;

        while (lowIndex < highIndex) {

            do {
                lowIndex++;
            } while (list[lowIndex] < list[pivotIndex]);

            do {
                highIndex++;
            } while (list[highIndex] > list[pivotIndex]);

            int bar = list[highIndex];
            list[highIndex] = list[lowIndex];
            list[lowIndex] = bar;
        }


    }

}
