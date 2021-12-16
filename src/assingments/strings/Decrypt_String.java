package assingments.strings;

public class Decrypt_String {
    public static void main(String[] args) {
        String str = "121";
        System.out.println(str.charAt(1));
        System.out.println(String.valueOf('1'));
        System.out.println(String.valueOf(str.charAt(1)));
        System.out.println(Integer.parseInt(String.valueOf(str.charAt(1)))-1+'a');
        System.out.println((char)(Integer.parseInt(String.valueOf(str.charAt(1)))-1+'a'));

//        String str2 = "10#";
//        for(int i = 0 ;i<str2.length(); i++){
//            if((i+2)<str2.length() && str2.charAt(i+2) == '#'){
//                System.out.println(str2.substring(i,i+2));
//                System.out.println(Integer.parseInt(str2.substring(i,i+2)));
//                System.out.println((char)(Integer.parseInt(str2.substring(i,i+2))-1));
//                System.out.println((char)((Integer.parseInt(str2.substring(i,i+2))-1)+'a'));
//                System.out.println((char)((Integer.parseInt(str2.substring(i,i+2)))+'a'-1));
//
//            }
//        }
    }
}
