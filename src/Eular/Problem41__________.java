package Eular;

/**
 * Created by Meth on 12/28/14.
 */
public class Problem41__________ {
    public static String permutation(String prefix, String numbers) {
        if (numbers.length() == 0) {
            return prefix;
        } else {
            for (int i = 0; i < numbers.length(); i++) {
                permutation(prefix + numbers.charAt(i),numbers.substring(0, i)+numbers.substring(i+1));
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(permutation("","123"));
    }
}
