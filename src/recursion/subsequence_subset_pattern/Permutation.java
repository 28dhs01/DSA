package recursion.subsequence_subset_pattern;

import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string-1587115620/1#
public class Permutation {
    public static void main(String[] args) {
//        String name = "Dhruv";
//        System.out.println(name.substring(0,4));
        //permutation("","abc");
//        System.out.println(permutationList("","abc"));
        //System.out.println(permutationCount("","abc"));

    }

    static void permutation(String p, String up) {
        // base condition
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        // body and recursion calls
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> permutationList(String p, String up) {
        // base condition
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // local ans
        ArrayList<String> ans = new ArrayList<>();

        // body and recursion calls
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutationList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

    static int permutationCount(String p, String up) {
        // base condition
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;

        // body and recursion calls
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            count += permutationCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
