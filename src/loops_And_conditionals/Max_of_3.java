package loops_And_conditionals;

import java.util.Scanner;

public class Max_of_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//        int max = a;
//        if( b>max ){
//            max = b;
//        }
//        if( c>max ){
//            max = c;
//        }
//        System.out.println(max);

        // using Math class
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
