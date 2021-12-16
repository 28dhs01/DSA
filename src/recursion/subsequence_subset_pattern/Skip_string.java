package recursion.subsequence_subset_pattern;

import java.util.ArrayList;

public class Skip_string {
    public static void main(String[] args) {
        String str = "bacapplecdahapp" ;
        String ans = skipAppNotApple(str) ;
        System.out.println(ans);

    }
    static String skipApple( String up ){
        if( up.isEmpty()){
            return "" ;
        }
        // body and relation
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0)+skipApple(up.substring(1));
        }
    }
    static String skipAppNotApple( String up ){
        // base condition
        if(up.isEmpty()){
            return "";
        }
        // body and relation
        if(up.startsWith("app") && !up.startsWith("apple")){
            // skip it
            return skipAppNotApple(up.substring(3));
        }
        else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }


}
