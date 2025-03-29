package com.features.leetcode.medium.minimumIndex;

import java.util.HashMap;
import java.util.List;

public class Solution {

    public int minimumIndex(List<Integer> nums) {

        int n = nums.size();
        // count dominant occurrence character
        HashMap<Integer, Integer> frequence = new HashMap<>();
        for (int num : nums) { // O(n)
            frequence.put(num, frequence.getOrDefault(num, 0) + 1);
        }

        int dominant = -1;
        int totalCount = 0;

        for (var entry : frequence.entrySet()) { // O(n)
            if (entry.getValue() > n / 2) {
                dominant = entry.getKey();
                totalCount = entry.getValue();
                break;
            }
        }

        // check validated split
        int leftCount = 0;
        for (int i = 0; i < n - 1; i++) { // O(n)
            if (nums.get(i) == dominant) {
                leftCount++;
            }

            int leftSize = i + 1;
            int rightSize = n - leftSize;
            int rightCount = totalCount - leftCount;

            if (leftCount * 2 > leftSize && rightCount * 2 > rightSize) {
                return i;
            }
        }

        return -1;
    }
}
