package assingments.recursion;

public class Power_of_4 {
    public static void main(String[] args) {
        boolean ans = isPower(24);
        System.out.println(ans);
    }

    private static boolean isPower(int n) {
        // base case
        if( n==1 ) return true;
        if( n%4 != 0 || n==0 ) return false;

        // relation
        return isPower(n/4);
    }
}
