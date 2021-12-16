package linear_search;

public class LinearSearch {
    public static void main(String[]args){
        int [] nums = {2,3,-1,42,98,100,39,-38,92};
        int target = 42;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr, int target){
        if(arr.length == 0) return -1;
        for(int idx = 0;idx<arr.length;idx++){
            if(arr[idx] == target){
                return idx;
            }
        }
        return -1;
    }

}

