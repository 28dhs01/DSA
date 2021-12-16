package binary_search;

import java.util.Arrays;

public class MatrixSortedRowWiseAndColumnWise {
    public static void main(String[] args) {
        int [][] matrix = {
                {10, 20, 30, 40, 50},
                {15, 25, 35, 45, 55},
                {28, 29, 37, 49, 60},
                {33, 34, 38, 50, 65}
        };
        int target = 49 ;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int [] search(int[][]matrix, int target){
        int r = 0 ;
        int c = matrix[r].length - 1 ;
        while( r < matrix.length && c >= 0  ){
            if( matrix[r][c] == target ){
                return new int[]{r,c};
            }
            if( target < matrix[r][c] ){
                c -- ;
            }
            else{
                r ++ ;
            }
        }
        return new int[]{ -1, -1 };
    }
}
