package bitwise_operators;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countSetBits(n));

    }
    static int countSetBits(int n ){
        int count = 0;
        while( n > 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
