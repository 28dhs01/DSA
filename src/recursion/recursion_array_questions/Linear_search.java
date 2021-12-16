package recursion.recursion_array_questions;

public class Linear_search {
    public static void main(String[] args) {
        int []ar = {3,2,1,18,18,9};
        int target = 18;
        System.out.println(linearSearchFromStart(ar,target,0));
        System.out.println(linearSearchFromEnd(ar,target,ar.length-1));
        System.out.println(linearSearchGetIndexFromStart(ar,target,0));
        System.out.println(linearSearchGetIndexFromEnd(ar,target,ar.length-1));
    }
    static boolean linearSearchFromStart(int []ar, int target, int index){
        // base condition
        if(index == ar.length){
            return false;
        }
        // relation
        return ar[index] == target || linearSearchFromStart(ar,target,index+1);
    }
    static boolean linearSearchFromEnd(int []ar, int target, int index){
        // base condition
        if(index == -1){
            return false;
        }
        // relation
        return ar[index] == target || linearSearchFromEnd(ar, target, index-1);
    }
    static int linearSearchGetIndexFromStart(int[]ar, int target, int index){
        // base cases
        if(ar[index] == target ){
            return index;
        }
        if(index>ar.length-1){
            return -1;
        }

        // relation
        return linearSearchGetIndexFromStart(ar, target, index+1);
    }
    static int linearSearchGetIndexFromEnd(int []ar, int target, int index){

        // base cases
        if(index == -1){
            return -1;
        }
        if(ar[index] == target){
            return index ;
        }
        // relation
        return linearSearchGetIndexFromEnd(ar, target, index-1);
    }
}
