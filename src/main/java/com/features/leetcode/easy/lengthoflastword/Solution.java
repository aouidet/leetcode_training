package com.features.leetcode.easy.lengthoflastword;

import java.util.Arrays;

public class Solution {

    public int lengthOfLastWord(String s) {
        var words = s.split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("   luffy    is  still joyboy   "));
    }
}
