package recursion.recursion_level_1;

public class n_to_1 {
    public static void main(String[] args) {
        int n = 5 ;
        //fun(n);
        //funRev(n);
        funBoth(n);
    }
    static void fun(int n){
        if( n == 0 ){
            return ;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funRev(int n){
        if( n == 0) {
            return ;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
