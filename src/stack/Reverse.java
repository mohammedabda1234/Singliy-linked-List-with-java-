package stack;

import java.util.Stack;

public class Reverse {
    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char c:chars){
            stack.push(c);
        }
        for (int i = 0; i < s.length(); i++) {
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = "coding";
        System.out.println(reverse(str));
    }
}
