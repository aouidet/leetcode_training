package com.features.leetcode.easy.removeduplicatefromstoredarray;

public class RemoveFromArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        int uniqueIndex = 0;  // Index to track the last unique element

        // Iterate over the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the last unique element
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;  // Increment uniqueIndex
                nums[uniqueIndex] = nums[i];  // Update the position for the next unique element
            }
        }

        return uniqueIndex + 1;  // Return the number of unique elements
    }
}
