package com.features.leetcode.easy.validparenthese;

import java.util.Stack;

public class Solution {
    public boolean isValid(String input) {
        Stack<Character> inputStack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                inputStack.push(c);
            } else {
                if (inputStack.isEmpty()) {
                    return false;
                }
                char top = inputStack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return inputStack.isEmpty();
    }
}
