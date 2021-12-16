package sorting_algo;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = { 4, 5, -1, 2, -3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void selectionSort(int [] arr){

        int n = arr.length ;
        for(int i = 0 ; i < n - 1 ; i ++ ){
            int last = n - 1 - i ;
            // find the max Index
            int max_idx = findMaxIdx( arr, 0, last );
            // now swap
            swap ( arr, max_idx, last);

        }
    }
    static void swap( int[] arr, int first , int second ) {
        int temp = arr[ first ] ;
        arr[ first ] = arr[ second ] ;
        arr [ second ] = temp ;

    }

    static int findMaxIdx( int[] arr, int start , int end ){
        int max_idx = start ;
        for( int i = start ; i <= end ; i ++ ) {
            if( arr[i] > arr[max_idx]){
                max_idx = i ;
            }
        }
        return max_idx ;

    }
}

