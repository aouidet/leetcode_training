package com.features.leetcode.recursivity.recursivesum;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] tableau = {1, 2, 3, 4, 5};
        System.out.println(solution.sommeRecursive(tableau, tableau.length)); //15
    }

    public int sommeRecursive(int[] tableau, int n) {
        if (n == 0) {
            return 0;
        }

        return tableau[n-1] + sommeRecursive(tableau, n -1);

    }
}
