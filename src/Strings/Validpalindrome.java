package Strings;

public class Validpalindrome {

    public static void main(String[] args) {

//        String str="aaba";
//        System.out.println(isPalindrome1(str));

        String s="A man, a plan, a canal: Panama";
//        String s="race a car";
//        String s="";
        System.out.println(isPalindrome(s));
    }


    public static boolean isPalindrome(String s) {
        if (s.isBlank()){
            return true;
        }
        s=s.toLowerCase();
        StringBuilder b=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        return isPalindrome1(b);
    }

    static boolean isPalindrome1(StringBuilder s){
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
