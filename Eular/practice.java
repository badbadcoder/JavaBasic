package Eular; /**
 * Created by Meth on 12/16/14.
 */

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        sqrt(num);
    }

    public static void sqrt(double foo) {
        double lastAnswer = 1;
        double nextAnswer = (lastAnswer + (foo / lastAnswer)) / 2;

        System.out.println(String.valueOf(lastAnswer) + "  " + nextAnswer);

        while (Math.abs(nextAnswer - lastAnswer) > 0.0000001) {
            lastAnswer = nextAnswer;
            nextAnswer = (lastAnswer + (foo / lastAnswer)) / 2;
            System.out.println(nextAnswer - lastAnswer);
        }
        System.out.println("Calculated lastAnswer is :"+lastAnswer+"\nReal lastAnswer is :"+Math.sqrt(foo));
    }


}
