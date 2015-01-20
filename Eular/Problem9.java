package Eular;

/**
 * Created by Meth on 12/20/14.
 */
public class Problem9 {
    public static void main(String[] args) {
        find();
    }

    public static void find() {
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                int c = 1000 - a - b;
                if (c * c == a * a + b * b) {
                    System.out.println(a * b * c);
                    return;
                }
            }
        }
    }
}
