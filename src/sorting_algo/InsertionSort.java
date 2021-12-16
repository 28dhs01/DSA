package sorting_algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = { 4, 5, 3, 1, 2} ;
        insertionSort(arr) ;
        System.out.println(Arrays.toString(arr));

    }
    static void insertionSort(int[] arr){
        int n = arr.length ;
        for( int i = 0 ; i < n - 1 ; i ++ ){
            for( int j = i + 1 ; j > 0 ; j -- ) {
                if( arr[ j ] < arr[ j - 1 ]){
                    swap( arr, j, j - 1 ) ;
                }
                else{
                    // when arr[ j ] is greater than arr [ j-1 ] no need to check previous as it has been already sorted in
                    // previous pass
                    break ;
                }
            }
        }
    }

    static void swap( int [] arr, int first , int second ){
        int temp = arr[ first ];
        arr[ first ] = arr [ second ] ;
        arr[ second ] = temp ;
    }
}
