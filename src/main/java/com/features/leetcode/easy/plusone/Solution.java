package com.features.leetcode.easy.plusone;

import java.util.Arrays;

public class Solution {

    public int[] plusOne(int[] digits) {
      for(int i = digits.length - 1; i >= 0; i--) {
          if(digits[i] < 9) {
              digits[i]++;
              return digits;
          }
          digits[i] = 0;
      }
      digits = new int[digits.length + 1];
      digits[0] = 1;
      return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.plusOne(new int[]{9,9}))); // 100
    }
}
