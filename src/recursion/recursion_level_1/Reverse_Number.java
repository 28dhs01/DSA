package recursion.recursion_level_1;

public class Reverse_Number {
    static int ans = 0 ;
    static void reverse1(int n){

        if( n == 0 ){
            return ;
        }

        int rem = n%10 ;
        ans = ans*10 + rem ;

        reverse1(n/10);
    }
    static int rev2(int n){

        int digits_present = (int)(Math.log10(n)) + 1 ;
        // i need helper function
        int ans = helper(n, digits_present) ;
        return ans;

    }

    static int helper(int n, int digit) {
        // base condition
        if( n%10 == n ){
            return n ;
        }
        // body
        int rem = n%10 ;

        // recurrence relation
        return rem*(int)(Math.pow(10,digit-1)) + helper(n/10, digit-1);
    }

    public static void main(String[] args) {
        int n = 1824 ;
        //reverse1(n);
        //System.out.println(ans);
        System.out.println(rev2(n));
    }
}
