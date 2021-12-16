package loops_And_conditionals;

import java.util.Scanner;

public class Lowercase_or_Uppercase {
    public static void main(String[] args) {
        System.out.println("Enter any word");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if( ch>='a' && ch<='z'){
            System.out.println("lowercase");
        }
        else {
            System.out.println("uppercase");
        }
    }
}
