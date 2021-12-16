package cycle_sort;

public class Duplicate_Number {
    public static void main(String[] args) {
        int [] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));

    }
    static int findDuplicate(int[] nums){
        // range is [1,n]
        // apply cycle sort
        int i = 0 ;
        while( i< nums.length){
            int correct = nums[i]-1;
            if( nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for( int j = 0 ; j<nums.length; j++){
            if( j != nums[j]-1){
                return nums[j];
            }
        }
        return -1;

    }
    static void swap(int []nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second]= temp;
    }
}
