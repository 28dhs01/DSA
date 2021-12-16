package cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));

    }
    static List<Integer> findDuplicates(int[] nums){

        // range : [1,n] -> apply cycle sort
        List<Integer> list = new ArrayList<>();
        int i = 0 ;
        while( i< nums.length ){
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct] ){
                swap( nums, i, correct);
            }
            else{
                i++;
            }
        }
        for( int j = 0 ; j<nums.length; j++){
            if( j != nums[j]-1){
                list.add(nums[j]);
            }
        }
        return list;


    }
    static void swap(int[]nums, int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
