package cycle_sort;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers {
    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static List<Integer> findDisappearedNumbers(int[] nums){

        // as nums are in range [1-n] apply cycle sort
        int i = 0 ;
        while( i < nums.length){
            int correct = nums[i]-1;
            if( nums[i] != nums[correct] ){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        // list to store ans
        List<Integer> list = new ArrayList<>();
        for( int j = 0 ; j < nums.length ;j++){
            if(nums[ j ] != j+1){
                list.add(j+1);
            }
        }
        return list;

    }
    static void swap(int []nums,int first ,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp ;
    }
}
