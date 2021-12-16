package recursion.recursion_level_1;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if( n == 0 ){
            return ;
        }
        System.out.println(n);
        // fun(n--); -> this will pass the value of 5 first and then subtract
        fun(--n);
    }

}
