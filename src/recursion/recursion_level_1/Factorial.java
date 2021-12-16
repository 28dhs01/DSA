package recursion.recursion_level_1;

public class Factorial {
    public static void main(String[] args) {
        int n = 5 ;
        int ans = factorial(n);
        System.out.println(ans);
    }

    static int factorial(int n) {

        // base condition
        if( n <= 1){
            return 1 ;
        }

        // recurrence relation
        return n*factorial(n-1);
    }
}
