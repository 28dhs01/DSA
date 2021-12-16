package bitwise_operators;

public class XOR_till_n {
    public static void main(String[] args) {
        int ans = xor(8);
        System.out.println(ans);
    }
    static int xor(int n){

        if(n%4 == 0){
            return n;
        }
        if(n%4 == 1){
            return 1;
        }
        if(n%4 == 2){
            return n+1;
        }
        else{
            return 0;
        }

    }
}
