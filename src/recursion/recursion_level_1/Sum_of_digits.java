package recursion.recursion_level_1;

public class Sum_of_digits {
    public static void main(String[] args) {
        int n = 1342 ;
        int ans = sumOfDigits(n);
        System.out.println(ans);
    }

    static int sumOfDigits(int n) {
        // can be solved using while loop but I want to solve it with recursion

        // base condition
        if( n ==  0 ){
            return 0 ;
        }

        int rem = n%10 ;
        // recurrence relation
        return rem + sumOfDigits(n/10);

    }
}
