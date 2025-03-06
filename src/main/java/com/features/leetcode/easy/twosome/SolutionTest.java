package com.features.leetcode.easy.twosome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SolutionTest {

    public int[] twoSum(int[] nums, int target) {
        // use cases
        // {2, 7, 4, 11}, 9 ==> {0, 1}
        // {2, 7, 4, 11}, 18 ==> {1, 3}
        // {2, 7, 4, 11}, 20 ==> {0}

        Map<Integer, Integer> reference = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(reference.containsValue(target - nums[i])) {
                return new int[]{reference.get(target - nums[i]), i};
            }
            reference.put(nums[i], i); //(2, 0) ||
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9))); // {0, 1}
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 4, 11}, 18))); // {1, 3}
        System.out.println(Arrays.toString(solution.twoSum(new int[]{3,2,4}, 6))); // {0}

    }
}
