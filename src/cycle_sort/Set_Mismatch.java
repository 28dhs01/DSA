package cycle_sort;

import java.util.Arrays;

public class Set_Mismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int []ans = findErrorNums(nums);
        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }
    static int[] findErrorNums(int[] nums){
        // range -[1,n] -> apply cycle sort
        int [] ans = new int[2];
        int i = 0 ;
        while( i < nums.length ){
            int correct = nums[i]-1;
            if( nums[correct] != nums[i] ){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        for( int j = 0 ; j<nums.length; j++){
            if( j != nums[j]-1 ){
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
        return ans;

    }
    static void swap( int[]nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
