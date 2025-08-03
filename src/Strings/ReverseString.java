package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="asim";

     // substring method in String class
     System.out.println(str.substring(0,3));

        String rev="";
        for (int i = str.length()-1; i>=0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}
