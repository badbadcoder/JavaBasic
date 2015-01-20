package Algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Meth on 1/9/15.
 */
public class InsertSort {

    static int[] insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int j = i;
            while (j > 0 && list[j] < list[j-1]) {
                int temp = list[j-1];
                list[j-1] = list[j];
                list[j] = temp;
                j--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            Random rand = new Random();
            list[i] = rand.nextInt(20) + 1;
        }
        System.out.println(Arrays.toString(insertSort(list)));
    }
}
