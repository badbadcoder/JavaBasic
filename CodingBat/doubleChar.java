package CodingBat;

/**
 * Created by Meth on 1/1/15.
 */
public class doubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("asdf"));
    }

    public static String doubleChar(String str) {
        String output = "";
        for(char foo : str.toCharArray()) {
            output += Character.toString(foo) + Character.toString(foo);
        }
        return output;
    }

}
