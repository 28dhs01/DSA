package sorting_algo;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []ar = { 3, 2, 1 , 7, 9 , 2, 4, 0 };
        System.out.println(Arrays.toString(bubbleSort(ar)));

    }
    static int [] bubbleSort(int[] arr){

        // apply bubble sort
        int n = arr.length;
        boolean swapped ;
        for (int i = 0 ; i < n-1 ; i++ ){
            swapped = false;
            for( int j = 1 ; j <= n-1-i ; j++ ){
                if(arr[j] < arr[j-1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    swapped = true;
                }
            }
            if( !swapped ){
                break;
            }
        }
        return arr;

    }
}
