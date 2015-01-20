package Eular;

/**
 * Created by Meth on 12/27/14.
 */
public class Problem21 {
    public static void main(String[] args) {
        long answer = 0;
        for (int i = 1; i <= 10000; i++) {
            int sum = sumOfPD(i);
            if (sumOfPD(sum) == i && sum != i) {
                answer += i + sum;
            }
        }
        System.out.println(answer/2);
    }



    public static int sumOfPD(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
