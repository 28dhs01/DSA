package linear_search;

public class SearchInRange {
    public static void main(String[]args){
        int [] nums = {2,3,-1,42,98,100,39,-38,92};
        int target = 2;
        int ans = linearSearch(nums,target,2,5);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr, int target, int start, int end){
        if(arr.length == 0) return -1;
        for(int idx = start; idx<=end; idx++){
            if(arr[idx] == target){
                return idx;
            }
        }
        return -1;
    }
}
