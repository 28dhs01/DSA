package assingments.recursion;

import java.util.Arrays;

public class Sum_triangle_for_array {
    public static void main(String[] args) {
        int[]ar = {1,2,3,4,5};
//        System.out.println(ar);
//        System.out.println(Arrays.toString(ar));
        printTriangle(ar);

    }
    static void printTriangle(int[]ar){
        if(ar.length == 0){
            return;
        }
        int[] temp = new int[ar.length-1];
        for(int i = 0 ; i<ar.length-1; i++ ){
            temp[i] = ar[i]+ar[i+1];
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(ar));

    }
}
