package binary_search;

public class FloorOfTarget {
    public static void main(String[] args) {
        int [] arr  = {2, 3, 5, 9, 11, 14, 16, 18, 20 };
        int target = 10;
        int ans_idx  = floorBS(arr, target);
        System.out.println(arr[ans_idx]);

    }
    static int floorBS(int [] arr, int target ){
        int start  = 0;
        int end = arr.length - 1 ;
        int mid;

        // if target is less than the arr smallest one
        if(target < arr[0]) return -1;
        while( start <= end){
            // find the mid
            mid = start + (end - start)/2;
            if(target < arr[mid]){
                end  = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }

        // when the loop ends if we don't get the target then end index will of that floor of target
        return end;

    }


}
