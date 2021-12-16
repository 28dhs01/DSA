package assingments.strings;

public class Defanging_IP_address {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "1.1.1";
        for(int i = 0 ; i<str.length() ; i++ ){
            if(str.charAt(i) == '.'){
                sb.append("[.]");

            }
            else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
