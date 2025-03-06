package com.features.leetcode.recursivity.factoriel;

public class Solution {

    public int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n -1);
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.factorial(5)); // 5*4*3*2*1
    }
}
