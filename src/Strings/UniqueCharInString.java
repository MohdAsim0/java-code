package Strings;

public class UniqueCharInString {
    public static void main(String[] args) {
//        String s = "tteetccoodde";
        String s="loveleetcode";
//        System.out.println(uniqueCharInStr(s));

        System.out.println(uniqueCharInString(s));

//        int i=0;
//        for (i = 0; i <10; i++) {
//            System.out.println(1);
//        }
//        System.out.println(i);

    }

    static int uniqueCharInStr(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    static int uniqueCharInString(String s) {

        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                return i;
            }
        }

        return -1;
    }
//    static int uniqueChar(String s) {
//        int ans=-1;
//        for (int i = 0; i < s.length(); i++) {
//          int j=i+1;
//            for ( j =i+1; j < s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    break;
//                }
//            }
//
//            if (j==s.length()) {
//                ans=i;
//            }
//        }
//
//        return ans;
//    }



}
