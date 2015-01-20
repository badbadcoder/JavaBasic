package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem6 {
    public static void main(String[] args) {
        long total1 = 0;
        long total2 = 0;
        for (int i = 1; i <= 100; i++) {
            total1 += i * i;
            total2 += i;
        }
        System.out.println(Long.toString(total2*total2-total1));
    }
}
