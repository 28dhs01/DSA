package strings;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String msg = "   hello bois   " ;
        String name  = "dhruv" ;
        System.out.println(name.toUpperCase());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('v'));
        System.out.println(msg.trim());
    }
}
