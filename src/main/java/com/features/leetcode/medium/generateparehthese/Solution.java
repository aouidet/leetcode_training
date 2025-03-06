package com.features.leetcode.medium.generateparehthese;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        // condition d'arret
        if(current.length() == max * 2) {
            result.add(current);
        }

        // ajouter une parhentése ouvrante si possible
        if(open < max) {
            backtrack(result, current +"(", open + 1, close, max);
        }

        if(open > close) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        //System.out.println(solution.generateParenthesis(1));
        //System.out.println(solution.generateParenthesis(2));
        System.out.println(solution.generateParenthesis(3));
        //System.out.println(solution.generateParenthesis(4));
    }
}
// 1 -> [()]
// 2 -> [()(), (())]
// 3 -> [()()(), (()()), (())(), ()(()), ((()))]