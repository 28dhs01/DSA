package assingments.bitwise;

public class Alternating_bits {
    public static void main(String[] args) {
        boolean ans = hasAlternatingBits(7);
        System.out.println(ans);
    }
    static boolean hasAlternatingBits(int n) {
        while( n > 0 ){
            if( (n&1) == ((n>>1)&1) ){
                return false ;
            }
            n = n>>1;
        }
        return true;
    }
}
