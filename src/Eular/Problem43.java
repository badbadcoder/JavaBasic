package Eular;

/**
 * Created by Meth on 12/31/14.
 */
public class Problem43 {

    public static long sum;

    public static boolean divisiable(String number) {
        int[] foo = {2,3,5,7,11,13,17};
        for (int i = 1; i <= 7; i++) {
            if (Integer.parseInt(number.substring(i,i+3)) % foo[i-1] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void genetatePan(String prefix, String number) {
        if (prefix.length() == 10) {
            if (divisiable(prefix)) {
                System.out.println(prefix);
                sum += Long.parseLong(prefix);
                System.out.println("sum is :"+sum);
            }
        }
        for (int i = 0; i < number.length(); i++) {
            genetatePan(prefix + number.substring(i,i+1), number.substring(0,i) + number.substring(i+1));
        }
    }

    public static void main(String[] args) {
        genetatePan("","0123456789");
    }
}
