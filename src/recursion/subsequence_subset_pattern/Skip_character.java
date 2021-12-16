package recursion.subsequence_subset_pattern;

public class Skip_character {
    public static void main(String[] args) {
       // skip("", "baccad");
        String ans = skip("baccad");
        System.out.println(ans);


    }
    static void skip(String p , String up){

        // string can also be returned but for basic knowledge string is printed
        // base condition
        if( up.isEmpty()){
            System.out.println(p);
            return ;
        }

        // body and relation
        char ch = up.charAt(0);
        if( ch == 'a'){
            // skip the a
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip(String up){

        // base condition
        if( up.isEmpty()){
            return "" ;
        }

        char ch = up.charAt(0) ;
        if(ch == 'a') {
            // skip it
            return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }

    }
}
