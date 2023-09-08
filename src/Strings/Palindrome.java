package Strings;
public class Palindrome {
    public static void main(String[] args) {

        String str="raceCa";
        str=str.toLowerCase();

        if (isPalindrome(str))
            System.out.println(str+ ":: yes it is palindrome");
        else
            System.out.println(str+":: No it is not a palindrome");

    }

    //Bool method to check a string is palindrome or not
    static boolean isPalindrome(String str){
        int l=0;
        int r=str.length()-1;

        while(l<r){
             if (str.charAt(l)!=str.charAt(r)){
                 return false;
                 }
             l++;
             r--;

    }

        return true;
    }
}
