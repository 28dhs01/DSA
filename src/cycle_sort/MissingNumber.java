package cycle_sort;

public class MissingNumber {
    public static void main(String[] args) {
        // range of numbers is (0-n)
        int []nums = {9,6,4,2,3,5,7,0,1} ;
        System.out.println(missingNumber(nums));

    }
    static int missingNumber(int[] nums){
        int i = 0 ;
        while( i < nums.length){
            int correct = nums[ i ];
            if( nums[i] < nums.length && i != correct){
                swap(nums,i,correct);
            }
            else {
                i++ ;
            }
        }
        for( int j = 0 ; j < nums.length; j ++ ){
            if(nums[j] != j){
                return j;
            }
        }
        // [0,1,2,3,4] - here missing one will be 5
        return nums.length;

    }
    static void swap( int []nums, int i , int correct){
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
