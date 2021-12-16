package loops_And_conditionals;

import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = 0 ;
        while( n>0 ){
            int last_digit = n%10;
            ans = ans*10 + last_digit;
            n/=10;
        }
        System.out.println(ans);
    }
}
