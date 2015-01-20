package Eular; /**
 * Created by Meth on 12/18/14.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) throws Exception {
        java.io.File file1 = new java.io.File("Eular.Problem8.txt");
        Scanner input = new Scanner(file1);

        String numbers = "";
        while (input.hasNext()) {
            String nextLine = input.nextLine();
            numbers += nextLine;
        }

        long maxProduct = 0;

        for (int i = 0; i <= numbers.length() - 13; i++) {
            long product = calculateProduct(numbers.substring(i, i + 13));
            if (maxProduct < product) {
                maxProduct = product;
            }
        }
        System.out.println(maxProduct);
    }

    public static long calculateProduct(String foo) {
        long result = 1;
        for (int i = 0; i <= foo.length()-1; i++) {
            int digit = Integer.parseInt(foo.substring(i, i + 1));
            if (digit == 0) {
                return 0;
            }
            result *= digit;
        }
        return result;
    }
}
