package recursion.recursion_level_1;

public class Product_of_digits {
    public static void main(String[] args) {
        int n = 55 ;
        int ans = sumOfDigits(n);
        System.out.println(ans);
    }

    static int sumOfDigits(int n) {

        // base condition
        if( n % 10 == n ){
            return n ;
        }

        int rem = n%10 ;
        // recurrence relation
        return rem * sumOfDigits(n/10);

    }
}
