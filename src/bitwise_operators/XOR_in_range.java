package bitwise_operators;

public class XOR_in_range {
    public static void main(String[] args) {
        int a = 3 ;
        int b = 9;
        int xor_till_b = xor(b);
        int xor_till_a = xor(a-1);
        int ans = xor_till_b ^ xor_till_a;
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
