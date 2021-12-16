package loops_And_conditionals;

import java.util.Scanner;

public class Counting_Occurrence {
    public static void main(String[] args) {
        System.out.println("Enter no. you want to check");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the digit whose count you want to check");
        int digit_you_want_to_check = in.nextInt();
        int count = 0 ;
        while( n>0 ){
            int last_digit = n%10;
            if(last_digit == digit_you_want_to_check){
                count++;
            }
            n/=10;
        }
        System.out.println(count);

    }
}
