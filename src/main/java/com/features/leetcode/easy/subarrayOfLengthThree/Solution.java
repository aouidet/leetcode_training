package com.features.leetcode.easy.subarrayOfLengthThree;

public class Solution {

    public static final int MAX_SUB_SEQUENCE = 3;

    public int countSubarrays(int[] nums) {

        int count = 0;
        for (int i = 0; i <= nums.length - MAX_SUB_SEQUENCE; i++) {
            int first = nums[i];
            int middle = nums[i + 1];
            int third = nums[i + 2];

            if(middle % 2 != 0) {
                continue;
            }
            if(first + third == middle / 2) {
                count ++;
            }
        }
        return count;
    }

    private static int getAbs(int nums) {
        return Math.abs(nums);
    }
}
