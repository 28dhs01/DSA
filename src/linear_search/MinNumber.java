package linear_search;

public class MinNumber {
    public static void main(String[]args){
        int []nums = {3, 2, -1,-3,10,23,-7,10,18};
        System.out.println(min(nums));
    }
    static int min(int[] arr){

        // assume arr.length != 0
        int min = Integer.MAX_VALUE;
        for(int element: arr){
            if(element<min){
                min = element;
            }
        }
        return min;
    }
}
