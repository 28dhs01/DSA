package cycle_sort;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));

    }
    static int firstMissingPositive(int[] nums){
        // time complexity - O(1)
        // space complexity - O(1)
        // can use cycle sort
        int i = 0;
        while( i<nums.length ){
            int correct = nums[i]-1;
            // ignore the negative and num>length
            if( nums[i]>0 && nums[i]<=nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for( int j = 0 ; j<nums.length; j++ ){
            if( j != nums[j]-1 ){
                return j+1;
            }
        }
        // [1,2,3,4] - ans should be 5 aka -> nums.length+1
        return nums.length+1;

    }
    static void swap( int []nums,int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
