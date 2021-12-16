package binary_search;

public class CeilOfTarget {
    public static void main(String[] args) {
        int []arr = {2, 3, 5, 9, 14, 16, 18, 20};
        int target = 10;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    static int binarySearch(int []arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;

        // if target is greater than the largest number in the array
        if(target > arr[arr.length-1]) return -1;

        while(start <= end){

            //find mid;
            mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
