package recursion.recursion_level_1;

import java.util.Scanner;

public class Palindrome_or_not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt() ;
        int rev_num = reverse(n);
        System.out.println("Reverse number is : "+rev_num);
        if( n == rev_num ){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
    static int reverse(int n){
        int total_digits = (int)(Math.log10(n)) + 1 ;
        return helper(n,total_digits);
    }
    static int helper( int n , int digits ){
        // base condition
        if( n%10 == n ){
            return n ;
        }
        // recurrence relation
        return (n%10)*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
