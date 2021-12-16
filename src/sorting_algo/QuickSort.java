package sorting_algo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int []arr = {5,4,3,2,1};
//        quickSort(arr, 0 , arr.length-1);
//        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[]nums, int low, int hi){
        if( low >= hi ){
            return ;
        }
        int s = low ;
        int e = hi ;
        int m = s + (e-s)/2 ;
        int pivot = nums[m] ;
        // put the pivot at right index
        while( s <= e ){

            // also preferred because if its already sorted it won't swap
            while( nums[s] < pivot){
                s++ ;
            }
            while( nums[e] > pivot){
                e-- ;
            }
            if( s<=e ){
                // swap
                int temp = nums[s];
                nums[s] = nums[e] ;
                nums[e] = temp ;
                s ++ ;
                e -- ;
            }
        }
        // now the pivot will be at right position
        // time to make recurrence calls
        quickSort(nums, low , e);
        quickSort(nums, s , hi);


    }
}
