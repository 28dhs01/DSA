package recursion.recursion_patterns_bubble_and_selection;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int []arr = {4,3,2,8,1};
        selection(arr, arr.length, 0,0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[]arr, int r, int c , int max_idx){
        // base case
        if( r == 0 ){
            return ;
        }
        if( c < r ){
            if( arr[c]> arr[max_idx] ){
                selection(arr, r, c+1,c);
            }
            else{
                selection(arr, r, c+1, max_idx);
            }
        }
        else{
            // swap
            int temp = arr[r-1];
            arr[r-1] = arr[max_idx];
            arr[max_idx] = temp ;
            selection(arr, r-1,0,0);
        }
    }
}
