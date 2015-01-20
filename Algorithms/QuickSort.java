package Algorithms;

import java.util.Arrays;

/**
 * This file is created by @Muffin_C on 1/20/15 16:35.
 * This file is part of Project JavaBasic.
 */
public class QuickSort {
    public static void quickSort(int[] list, int lowIndex, int highIndex) {

        if (highIndex <= lowIndex) {
            return;
        }

        int pivotIndex = partition(list, lowIndex, highIndex);

        quickSort(list, lowIndex, pivotIndex - 1);
        quickSort(list, pivotIndex + 1, highIndex);

    }

    public static int partition(int[] list, int lowIndex, int highIndex) {

        int low = lowIndex - 1;
        int high = highIndex;

        int pivotIndex = (int) (Math.random() * (highIndex - lowIndex)) + lowIndex;

        swap(list, pivotIndex, highIndex);

        while (true) {
            while (list[++low] < list[highIndex]) {
                if (low == highIndex) {
                    break;
                }
            }

            while (list[--high] > list[highIndex]) {
                if (high == lowIndex) {
                    break;
                }
            }

            if (low >= high) {
                break;
            }

            swap(list, low, high);
        }
        swap(list, highIndex, low);
        return low;
    }

    public static void swap(int[] list, int i, int j) {
        int foo = list[i];
        list[i] = list[j];
        list[j] = foo;
    }

    public static int[] makeArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] =  (int) (n * Math.random());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = makeArray(0);
//        a = new int[] {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(a));
        quickSort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
