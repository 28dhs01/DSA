package assingments.recursion;

public class First_uppercase {
    public static void main(String[] args) {
        String name = "dhRuv";
        System.out.println(firstUppercase(name,0));
    }
    static char firstUppercase(String name, int i){
        // base condition
        if(i==name.length()){
            return '0';
        }
        if(name.charAt(i)>='A' && name.charAt(i)<='Z'){
            return name.charAt(i);
        }
        // recurrence relation
        return firstUppercase(name,i+1);
    }
}
