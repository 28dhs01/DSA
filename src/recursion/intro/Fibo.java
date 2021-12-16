package recursion.intro;

public class Fibo {
    public static void main(String[] args) {
//        int ans = fibo( 7 ) ;
//        System.out.println(ans);

        System.out.println(fiboFormula(5));
    }

    // formula for nth fibonacci number: 
    static long fiboFormula( int n ){
        return (long)((Math.pow(((1 + Math.sqrt(5)) / 2) , n ) - Math.pow(((1 - Math.sqrt(5)) / 2) , n ) ) / Math.sqrt(5));
    }
    static int fibo( int n ) {

        // base condition
        if( n < 2 ){
            return n ;
        }
        // recurrence relation
        // this is not tail recursion
        return fibo( n - 1 ) + fibo( n - 2 ) ;
    }
}
