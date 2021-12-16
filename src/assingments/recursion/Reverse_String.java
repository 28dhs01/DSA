package assingments.recursion;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        String [] str = {"d", "h", "r", "u", "v"};
        // str = {"v" , "u", "r" ,"h", "d"}
        String []ans = reverseString(str);
        System.out.println(Arrays.toString(ans));

        }
    static String[] reverseString(String []str ){
        int s = 0 ;
        int e = str.length -1 ;
        while(s<=e){
            swap(str,s,e);
            s++;
            e--;
        }
        return str ;
    }
    static void swap(String[]str, int first, int second){
        String temp = str[first];
        str[first] = str[second];
        str[second] = temp;
    }

}
