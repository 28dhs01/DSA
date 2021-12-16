package binary_search;

public class BinarySearchAlgo {
    public static void main(String[]args){
        int []arr = {1, 3, 9, 10, 16, 20, 30, 42, 61};
        int target = 300;
        int res_idx = binarySearch(arr,target);
        System.out.println(res_idx);
    }
    static int binarySearch(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start<=end){

            //find mid element
            //mid = (start+end)/2; this may exceed max int value
            mid = start + (end - start)/2;


            //if target value is greater than arr[mid]
            if(target>arr[mid]){
                start = mid+1;
            }

            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }

}
