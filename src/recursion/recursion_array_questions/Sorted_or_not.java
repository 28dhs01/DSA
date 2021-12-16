package recursion.recursion_array_questions;

public class Sorted_or_not {
    public static void main(String[] args) {
        int [] ar = {1,3,5,9};
        // System.out.println(iterative(ar));
        boolean ans = sorted(ar,0);
        System.out.println(ans);
    }
    static boolean sorted(int []ar, int index ){

        // base condition
        if(index == ar.length-1){
            return true;
        }
        // relation
        return ar[index]<ar[index+1] && sorted(ar,index+1);

    }
//    static boolean iterative(int[]ar){
//        // iterative approach
//        int n = ar.length;
//        for( int i = 0 ; i<n-1 ; i++ ){
//            if(ar[i]>ar[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }
}
