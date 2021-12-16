package recursion.subsequence_subset_pattern;

import java.util.ArrayList;

public class LetterCombinations {
    public static void main(String[] args) {
        //letterCombinations("","89");
        //System.out.println(letterCombinationsRet("","34"));
        System.out.println(letterCombinationsCount("","12"));

    }
    static void letterCombinations(String p, String up ){
        // base condition
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }
        // body and calls
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit-1)*3; i < digit*3 && i<26 ; i++) {
            char ch = (char) ('a' + i); // this will convert 2 into 'c'
            letterCombinations(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> letterCombinationsRet(String p ,String up){

        // base condition
        if( up.isEmpty() ){
            ArrayList<String> list  = new ArrayList<>();
            list.add(p);
            return list ;
        }
        // body and calls
        ArrayList<String> ans  = new ArrayList<>();
        char ch = up.charAt(0);
        int digit = ch - '0' ;
        for( int i = (digit-1)*3 ;  i<digit*3 && i<26 ; i++ ){
            char ch2 = (char)( 'a' + i ) ;
            ans.addAll(letterCombinationsRet(p+ch2, up.substring(1)));
        }
        return ans ;
    }
    static int letterCombinationsCount(String p , String up ){
        if( up.isEmpty() ){
            return 1 ;
        }
        // body and calls
        int count = 0 ;
        char ch = up.charAt(0) ;
        int digit = ch - '0' ;
        for (int i = (digit-1)*3 ; i < digit*3; i++) {
            char ch2 = (char)('a' + i) ;
            count = count + letterCombinationsCount(p+ch2,up.substring(1));
        }
        return count ;
    }
}
