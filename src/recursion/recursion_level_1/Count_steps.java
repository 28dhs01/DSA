package recursion.recursion_level_1;



public class Count_steps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));

    }
    static int numberOfSteps(int num) {
        return helper(num, 0);

    }
    static int helper(int n, int steps){
        // base condition
        if( n == 0 ){
            return steps;
        }
        // recurrence relation
        if( n % 2 == 0 ){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }
}
