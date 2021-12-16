package binary_search;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int [] arr = {2, 3 , 5, 6, 7, 10, 11 , 12, 15, 20, 24, 30, 50,78, 300};
        int target = 15;
        int ans = findingRange(arr,target);
        System.out.println(ans);
    }
    static int findingRange(int []arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end] ){
            int newStart = end + 1;

            // end should be end + 2*size
             end = end + (end - start +1)*2;
             start = newStart;

        }
        return binarySearch(arr, target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
