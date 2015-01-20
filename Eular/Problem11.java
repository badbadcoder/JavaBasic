package Eular;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Meth on 12/23/14.
 */
public class Problem11 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("Eular.Problem11.txt"));
        int[][] numbers = new int[20][20];

        for (int i = 0; i <= 19; i++) {
            for (int j = 0; j <= 19; j++) {
                numbers[i][j] = input.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(numbers));
        int max = 0;
        for (int i = 0; i <= 19; i++) {
            for (int j = 0; j <= 19; j++) {
                max = Math.max(max,calculateMaxProduct(i,j,numbers));
            }
        }
        System.out.println(max);
        System.out.println(70600674);
    }


    public static int calculateMaxProduct(int X, int Y, int[][] numbers) {
        int maxProduct = -1;
        int product = 1;
        if (X <= 16) {
            for (int shift = 0; shift <= 3; shift++) {
                product *= numbers[X + shift][Y];
            }
            maxProduct = Math.max(product,maxProduct);
        }
        product = 1;
        if (Y <= 16) {
            for (int shift = 0; shift <= 3; shift++) {
                product *= numbers[X][Y + shift];
            }
            maxProduct = Math.max(product, maxProduct);
        }
        product = 1;
        if (X <= 16 & Y<=16) {
            for (int shift = 0; shift <= 3; shift++) {
                product *= numbers[X + shift][Y + shift];
            }
            maxProduct = Math.max(product, maxProduct);
        }
        product = 1;
        if (X >= 3 & Y<= 16) {
            for (int shift = 0; shift <= 3; shift++) {
                product *= numbers[X - shift][Y + shift];
            }
            maxProduct = Math.max(product, maxProduct);
        }
        return maxProduct;
    }

}
