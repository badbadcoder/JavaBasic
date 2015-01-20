package Eular;

/**
 * Created by Meth on 12/17/14.
 */
public class Problem5 {
    public static void main(String[] args) {
        for (int foo = 1; ; foo += 1) {
            boolean finishedLoop = true;
            for (int bar = 2; bar <= 20; bar++) {
                int twoBar = bar * 2;
                if (foo % twoBar != 0) {
                    finishedLoop = false;
                    break;
                }
            }
            if (finishedLoop) {
                System.out.println(foo);
                for (int bar = 2; bar <= 20; bar ++) {
                    System.out.println(foo+"/"+bar+"="+foo/bar);
                }
                break;
            }
        }
    }
}
