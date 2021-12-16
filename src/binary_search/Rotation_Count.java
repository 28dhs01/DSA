package binary_search;

public class Rotation_Count {
    public static void main(String[] args) {
        int [] arr = { 15, 18, 20 ,  2, 3, 6, 12};
        int pivot = findPivot(arr);
        System.out.println(pivot + 1);
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1 ;
        while( start <= end ){
            // find the mid
            int mid  = start+ ( end - start ) / 2 ;
            if( arr[ mid ] > arr[ mid + 1]){
                return  mid  ;
            }
            if( arr[ mid ] < arr[ mid - 1]){
                return  mid - 1  ;
            }
            if ( arr[ start ] <= arr[ mid ] ) {
                start = mid + 1;
            }
            else{
                end  = mid - 1;
            }
        }
        return -1 ;
    }
}
