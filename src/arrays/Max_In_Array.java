package arrays;

public class Max_In_Array {
    public static void main(String[] args) {
        int[] ar = {};
        int ans = max(ar);
        System.out.println(ans);

    }
    static int max(int[] ar){
        if(ar.length == 0 ){
            return -1;
        }
        int max = ar[0];
        for( int i = 1 ; i<ar.length ; i++){
            if( ar[i]> max ){
                max = ar[i];
            }
        }
        return max;

    }
}
