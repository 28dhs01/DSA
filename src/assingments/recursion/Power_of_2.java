package assingments.recursion;

public class Power_of_2 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));

    }
    static boolean isPowerOfTwo(int n){
        // base case
        if( n == 1 ){
            return true;
        }
        if( n%2 != 0 ){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}
