package assingments.recursion;

public class Min_in_Array {
    public static void main(String[] args) {
        int []ar = {3,2,1,7};
        int n = ar.length;
        int ans = findMin(ar,n);
        System.out.println(ans);
    }
    static int findMin(int[]ar, int n){

        // base condition
        if(n == 1){
            return ar[0];
        }
        // recurrence relation
        return Math.min(ar[n-1],findMin(ar,n-1));
    }

}
