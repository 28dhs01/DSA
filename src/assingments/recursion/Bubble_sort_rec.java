package assingments.recursion;

import java.util.Arrays;

public class Bubble_sort_rec {
    public static void main(String[] args) {
        int []ar = {3,4,5,1,2};
        bubbleSort(ar,ar.length);
        System.out.println(Arrays.toString(ar));

    }
    static void bubbleSort(int[]ar, int n){
        // base condition
        if(n==1) {
            return ;
        }
        for( int j = 1 ; j<=n-1; j++){
            if(ar[j]<ar[j-1]){
                int temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp;
            }
        }
        // recurrence relation
        bubbleSort(ar,n-1);
    }
}
