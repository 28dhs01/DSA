package linear_search;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[]args){
        int[][] arr = {
                {1, 2 ,3},
                {4, 5},
                {6, 7, 8, 9}
        };
        int target = 7;
        System.out.println(Arrays.toString(searchTarget(arr,target)));
    }
    static int[]  searchTarget(int[][] arr, int target){
        int [] ans = new int[2];
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] == target){
                    ans = new int[]{row, col};
                }
            }

        }
        return ans;

    }

}
