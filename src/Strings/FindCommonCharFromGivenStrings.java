package Strings;

public class FindCommonCharFromGivenStrings {
    public static void main(String[] args) {
        String s1="newstyle";

        String s2="newtonschool";
//empty string to store the common characters
        String s="";

        for (int  i = 0; i <s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s += s2.charAt(j);
                }
            }
        }
            System.out.println(s);
    }
}
