package Eular;

/**
 * Created by Meth on 12/27/14.
 */
public class Problem23_______ {
    public static void main(String[] args) {
        int[] abundants = generateAbundants();
        int[] sumOfAbundants = new int[50000000];
        int currentIndex = 0;
        for (int abundant1 : abundants) {
            if (abundant1 != 0) {
                for (int abundant2 : abundants) {
                    if (abundant2 != 0 && abundant2 >= abundant1) {
                        sumOfAbundants[currentIndex] = abundant1 + abundant2;
                        currentIndex++;
                    }
                }
            }
        }
        int answer = 0;
        for (int i = 1; i <= 20123 ; i++) {
            answer += i;
        }

        for (int sum : sumOfAbundants) {
            if (sum <= 28123 && sum > 0) {
                answer -= sum;
            }
        }
        System.out.println(answer);
    }

    public static int[] generateAbundants() {
        int[] foo = new int[28123];
        int currentIndex = 0;
        for (int i = 1; i <= 28123; i++) {
            if (Problem21.sumOfPD(i) > i) {
                foo[currentIndex] = i;
                currentIndex++;
            }
        }
        return foo;
    }
}
