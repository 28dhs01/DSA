package bitwise_operators;

public class Odd_or_Even {
    public static void main(String[] args) {
        int n= 20;
        System.out.println(odd(n));

    }
    static boolean odd(int n){
        if((n&1) == 1){
            return true;
        }
        return false;
    }
}
