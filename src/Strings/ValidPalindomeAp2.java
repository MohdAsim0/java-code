package Strings;

public class ValidPalindomeAp2 {
    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s="race, ,car";
        //String s = "";
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        //INITIALIZE TWO POINTERS 0 AND end
        int l = 0;
        int r = s.length() - 1;


        while (l<r) {

            //jabtak l<r and charcter at l pointer is not a digit or a letter
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))
                //increase l by 1 as it is not alphanumeric
                ++l;

            //jabtak l<r and charcter at r pointer is not a digit or a letter
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))
                //decrease r by 1 as it is not alphanumeric
                --r;

            //CHECK FOR PALINDROME if char at l and r are not equal --NOT A palindrome return false
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            //after each iteration ++l and --r
            ++l;
            --r;
        }
        //if palindrome return true........
        return true;
    }


}
