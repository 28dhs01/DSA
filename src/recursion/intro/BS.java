package recursion.intro;

public class BS {
    public static void main(String[] args) {
        int []arr = {1,2,3, 4, 55, 76,88};
        int target = 88 ;
        int ans = bs(arr, target,0,arr.length-1);
        System.out.println(ans);
    }
    static int bs( int [] arr, int target, int s ,int e){
        if( s > e ) {
            return -1 ;
        }
        int m = s + ( e - s ) / 2 ;
        if( arr[ m ] == target ){
            return m ;
        }
        if( target < arr[ m ]){
            return bs( arr, target, s, m-1) ;
        }
        return bs( arr, target, m + 1, e) ;
    }
}
