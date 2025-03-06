package com.features.leetcode.medium.reverseinteger;

import ch.qos.logback.core.spi.PreSerializationTransformer;

public class Solution {

    public int reverseInteger(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10; // extract last digit
            x /= 10;
            if(reversed > Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > 7) {
                return 0;// remove last digit
            }
            if(reversed < Integer.MAX_VALUE / 10 || reversed == Integer.MAX_VALUE / 10 && pop > -8) {
                return 0;// remove last digit
            }
            reversed = reversed * 10 + pop;
        }
        return reversed;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseInteger(-123));
    }
}
