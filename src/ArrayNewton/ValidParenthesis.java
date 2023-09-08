package ArrayNewton;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(())()";
        validateParen(s);
    }

    private static void validateParen(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else {
                st.pop();
            }
        }
        if (st.empty()){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
