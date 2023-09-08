package Strings;

public class ValidAngram {
    public static void main(String[] args) {
        String s="cat";
        String  t="rat";

        System.out.println(anagram(s,t));
    }
    
    static boolean anagram(String s,String t){
        
        int m=s.length();
        int n=t.length();
        //if length of string is not equal then it is obvious not anagram
        if(m!=n) return false;

        //create a count array upto 26 characters(a-z)
        int[] count_arr=new int[26];

        //add the count of alphabets of s
        for (int i = 0; i < m; i++) {
            count_arr[s.charAt(i)-'a']++;
        }

        //remove that count of alphabets of t
        for (int i = 0; i < n; i++) {
            count_arr[t.charAt(i)-'a']--;
        }

        //if count is not zero it means not all char equal
        for (int i = 0; i < count_arr.length; i++) {
            if (count_arr[i]!=0){
                return false;
            }
        }
        return true;
        
        
    }
}
