package loops_And_conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter Fibo you want");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0 ;
        int b = 1 ;
        int count = 2 ;
        while( count<= n ){
            int temp = b ;
            b += a ;
            a = temp ;
            count++;
        }
        System.out.println(b);
    }
}
