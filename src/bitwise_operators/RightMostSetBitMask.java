package bitwise_operators;

public class RightMostSetBitMask {
    public static void main(String[] args) {
        int n = 10;
        int rsbm = n & -n ;
        System.out.println(Integer.toBinaryString(rsbm));
        
    }
}
