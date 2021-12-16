package binary_search;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class RBS_with_duplicates {

    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1} ;
        int target  = 2 ;
        boolean ans = search(nums, target);
        System.out.println(ans);
    }
    static boolean search(int[] nums, int target) {
        if( nums.length == 1 ){
            if( target == nums[0] ){
                return true ;
            }
            else{
                return false ;
            }
        }
        int pivotIdx = findPivot(nums) ;
        if (pivotIdx == -1){
            return bs(nums, target, 0, nums.length-1 );
        }
        else{
            boolean findTarget = bs(nums,target,0,pivotIdx );
            if( findTarget == true ){
                return true ;
            }
            else{
                return bs(nums,target,pivotIdx+1,nums.length-1);
            }
        }

    }
    static int findPivot( int []nums ){
        int s = 0 ;
        int e = nums.length-1 ;
        int m ;
        while( s <= e ){
            m = s+(e-s)/2 ;
            if ( m < e && nums[ m ] > nums[ m + 1 ] ){
                // nums[m] will be pivot
                return m ;
            }
            if( m > s && nums[ m ] < nums[ m - 1 ] ){
                // nums[m-1] will be pivot
                return m-1 ;
            }

            if( nums[ s ] == nums[ m ] && nums[ m ] == nums[ e ] ){
                if(  nums[s] > nums[s+1]){
                    // nums[s] will be pivot
                    return s ;
                }
                s++ ;
                if(  nums[ e ] < nums[ e-1 ]){
                    // nums[e-1] will be pivot
                    return e-1;
                }
                e-- ;
            }
            else if( nums [s] < nums[m] || (nums[ s ] == nums[m] && nums[m] > nums[e]) ){
                s = m+1 ;
            }
            else{
                e = m-1 ;
            }
        }
        return -1 ;
    }
    static boolean bs(int[]nums,int target, int s , int e){
        while( s<=e ){
            int m = s+(e-s)/2 ;
            if( target == nums[m] ){
                return true ;
            }
            if( target > nums[m] ){
                s = m+1;
            }
            else{
                e = m-1 ;
            }
        }
        return false ;
    }
}
