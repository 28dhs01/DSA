package recursion.recursion_level_1;

public class Sum {
    public static void main(String[] args) {
        int n = 8 ;
        int ans = sum(n);
        System.out.println(ans);
    }

    static int sum(int n) {
        if( n == 1 ){
            return 1 ;
        }

         return n+sum(n-1);

    }
}
