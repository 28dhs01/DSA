package assingments.recursion;

public class String_length {
    public static void main(String[] args) {
        String name  = "Dhruv";
        int ans = strLen(name);
        System.out.println(ans);
    }
    static int strLen(String str){
        if(str.equals("")){
            return 0;
        }
        return 1+strLen(str.substring(1));
    }

}
