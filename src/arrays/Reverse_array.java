package arrays;

import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {

        int []ar = {2,9,4,2,7};
        rev(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void rev(int[]ar){
        int start = 0 ;
        int end = ar.length-1 ;
        while( start<end ){
            swap(ar,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[]ar, int first, int second){
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }
}
