package CONTEST1.CorrectBracketSequence;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static boolean check(String s) {
        // нужно понять правильная ли последовательность скобочек
        Stack<Character> temp = new Stack<>();
        Map<Character, Character> allParenthesis = new HashMap<>();
        allParenthesis.put(')', '(');
        allParenthesis.put(']', '[');
        allParenthesis.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if (allParenthesis.containsKey(current)) {
                if (temp.size() == 0) {
                    return false;
                } else {
                    if (temp.peek() == allParenthesis.get(current)) {
                        temp.pop();
                    } else {
                        return false;
                    }
                }
            }
            else{
                temp.push(s.charAt(i));
            }
        }

        return temp.size() == 0;
    }

    public static void main(String[] args) {
        String s = "(()(())){}[(]";
        System.out.println(check(s));
    }
}
