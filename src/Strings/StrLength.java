package Strings;
//Ctrl+alt+L

public class StrLength {
    public static void main(String[] args) {
        String s = "asimkhanbdsjkg";
        int l = 0;
        for (char ch : s.toCharArray()) {
            l++;
        }
        System.out.println(l);

//   char[] c=s.toCharArray();
//      System.out.println(c.length);


    }
}
