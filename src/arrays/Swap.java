package arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[]ar = {3,6,4,8,19};
        int first_idx= 1;
        int second_idx = 3;
        swap(ar, first_idx,second_idx);
        System.out.println(Arrays.toString(ar));
    }
    static void swap( int[]ar, int first, int second){
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }
}
