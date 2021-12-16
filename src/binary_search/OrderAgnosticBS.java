package binary_search;

public class OrderAgnosticBS {
    public static void main(String[]args){
        int [] arr = {90, 73, 63, 50, 45, 23, 10 };
        int target = 10;
        int res_idx = orderAgnosticBS(arr, target);
        System.out.println(res_idx);
    }
   static int orderAgnosticBS(int[]arr, int target){
        int res_idx = -1;
        int start = 0;
        int end  = arr.length-1;
        int mid;
        boolean isAsc = arr[start]<arr[end];
        while(start <= end){

             //find the mid
            mid = start + (end - start)/2;

            // one condition same for both
            if(target == arr[mid]) res_idx = mid;


            if(isAsc){
                if(target>arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(target > arr[mid] ){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return res_idx;

   }
}
