package binary_search;

public class NearlySortedArray {
    public static void main(String[] args) {
        int []arr = {10 , 3 , 40, 20 , 50, 80 ,70};
        int target  = 3 ;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target ){
        int start  = 0 ;
        int end = arr.length - 1 ;
        while ( start <= end ){
            // find the mid
            int mid = start + ( end - start ) / 2 ;
            if ( target == arr[ mid ]){
                return mid ;
            }
            if ( mid > start &&  target == arr[mid - 1]){
                return mid - 1 ;
            }
            if ( mid < end && target == arr[ mid + 1 ]){
                return mid + 1;
            }
            if ( target < arr[ mid ]){
                end = mid - 2 ;
            }
            else {
                 start = mid + 2 ;
            }
        }
        return - 1 ;
    }
}
