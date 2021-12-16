package recursion.recursion_level_1;

public class Count_zeros {
    public static void main(String[] args) {
        int n = 302040 ;
        System.out.println(countZeros(n));
    }

    static int countZeros(int n) {
       return helper(n,0);
    }

    static int helper(int n, int count){
        // base condition
        if( n == 0 ){
            return count ;
        }
        // body
        int rem = n%10;
        // recurrence relation
        if( rem == 0 ){
            return helper(n/10, count+1);
        }
        else{
            return helper(n/10, count);
        }
    }

}
