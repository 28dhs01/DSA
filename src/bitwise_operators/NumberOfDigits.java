package bitwise_operators;

public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 3289;
        int b = 10;
        int ans =  (int)(Math.log(n)/Math.log(b)) + 1 ;
        System.out.println(ans);
    }
}
