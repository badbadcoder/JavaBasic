package Eular;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Meth on 12/23/14.
 */
public class Problem13 {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(new File("Eular.Problem13.txt"));

        int[][] numbers = new int[100][50];
        int[] result = new int[51];

        for (int i = 0; i <= 99; i++) {
            String numberString = input.next();
            for (int j = 0; j < numberString.length(); j++){
                numbers[i][j] = numberString.charAt(j) - '0';
            }
        }

        System.out.println(Arrays.deepToString(numbers));

        for (int digit = 49; digit >= 0; digit--) {
            int addResult = 0;
            for (int numberIndex = 0; numberIndex <= 99; numberIndex++) {
                addResult += numbers[numberIndex][digit];
            }
            result[digit+1] += addResult;
            String foo = Integer.toString(result[digit+1]);
            result[digit+1] = Integer.parseInt(foo.substring(foo.length()-1));
            result[digit] = Integer.parseInt(foo.substring(0,foo.length()-1));
        }
        System.out.println(Arrays.toString(result));
    }
}
