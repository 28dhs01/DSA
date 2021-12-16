package recursion.subsequence_subset_pattern;

import java.util.ArrayList;

// https://www.codingninjas.com/codestudio/problems/subsequences-of-string_985087?leftPanelTab=1
public class SubSequence {
    public static void main(String[] args) {
       // subSeq("", "abc");
//        ArrayList<String> ans = subSeq("","abc",new ArrayList<String>());
//        System.out.println(ans);
       // System.out.println(subSeqRet("","abc"));
        System.out.println(subSetAscii("","abc"));

    }
    static void subSeq( String p , String up ){
        // base case
        if( up.isEmpty() ){
            System.out.println(p);
            return ;
        }
        // body and relations
        subSeq(p+up.charAt(0),up.substring(1));
        subSeq(p,up.substring(1));
    }
    static ArrayList<String> subSeq(String p, String up,ArrayList<String> list){
        // base condition
        if( up.isEmpty() ){
            list.add(p);
            return list;
        }
        // body and relations
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1),list);
        subSeq(p,up.substring(1),list);
        return list ;
    }
    static ArrayList<String> subSeqRet(String p, String up){
        // base condition
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list ;
        }
        // body and relation
        char ch = up.charAt(0) ;
        ArrayList<String> left = subSeqRet(p+ch, up.substring(1));
        ArrayList<String> right  = subSeqRet(p, up.substring(1));
        left.addAll(right);
        return left ;
    }
    static ArrayList<String> subSetAscii(String p , String up){
        if( up.isEmpty() ){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> f = subSetAscii(p+ch,up.substring(1));
        ArrayList<String> s = subSetAscii(p,up.substring(1));
        ArrayList<String> t = subSetAscii(p+(ch+0),up.substring(1));
        f.addAll(s);
        f.addAll(t);
        return f ;
    }
}
