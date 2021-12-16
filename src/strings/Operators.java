package strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a"+1);
        System.out.println("Dhruv" + new ArrayList<>());
        //System.out.println(4+new ArrayList<>()); // can't be done string needed to be add
        System.out.println(4+""+ new ArrayList<>());
    }
}
