package com.features.leetcode.easy.searchinsertposition;

import java.util.Arrays;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                left = mid + 1;
            }
            if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(solution.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
