package strings;

public class Palindrome_string {
    public static void main(String[] args) {
        String str = "racecar";
        boolean ans = isPalindrome(str);
        System.out.println(ans);
    }
    static boolean isPalindrome(String str){
        int s = 0 ;
        int e = str.length() - 1 ;
        while(s<= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
