package assingments.recursion;

public class Product_of_2_nums {
    public static void main(String[] args) {
        int x = 9;
        int y = 8;
        int ans = product(x,y);
        System.out.println(ans);
    }

    private static int product(int x, int y) {

        // base case
        if( y== 1 ){
            return x;
        }
        // relation
        return x+product(x,y-1);
    }
}
