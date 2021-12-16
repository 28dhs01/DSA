package bitwise_operators;
// https://practice.geeksforgeeks.org/problems/magic-number4431/1#
public class MagicNumber {
    public static void main(String[] args) {
        int n = 4 ;

        int ans = 0 ;
        int base = 5;
        while( n > 0 ){
            // get the last digit
            int last = n & 1 ;
            ans += last * base;
            base = base*5;
            n = n>>1;
        }
        System.out.println(ans);
    }
}
