package StackDs;

import java.util.*;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // first we can check closing case, if its false then by default
            // itll be opening case
            if ((curr == ')')) {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1)
                    return true;

            } else {
                s.push(curr);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String trueExp = "((a+b)+(c+d))";
        String falseExp = "(((a+b)+(c+d)))";
        System.out.println(isDuplicate(trueExp));
        System.out.println(isDuplicate(falseExp));
    }
}
