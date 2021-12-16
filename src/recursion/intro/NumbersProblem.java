package recursion.intro;

public class NumbersProblem {
    public static void main(String[] args) {

        print1(1) ;
    }
//    static void print1(int n){
//        System.out.println(n);
//        print2(2);
//    }
//    static void print2(int n ){
//        System.out.println(n);
//        print3(3);
//    }
//    static void print3(int n ){
//        System.out.println(n);
//        print4(4);
//    }
//    static void print4(int n ){
//        System.out.println(n);
//        print5(5);
//    }
//    static void print5(int n ){
//        System.out.println(n);
//    }
    static void print1(int n){

        // base condition
        if( n == 5 ){
            System.out.println(n);
            return ;
        }
        System.out.println(n);

        // recursive call
        // if you are calling same function again and again treat it as a separate call in the stack

        // Tail Recursion
        // this is the last function call
        print1(n+1);
    }
}
