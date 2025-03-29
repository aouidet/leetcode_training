package com.features.leetcode.easy.reemoveelement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxIntegerSequenceTest {

    Solution solution = new Solution();

    @Test
    void removeElement_shouldReturn0_whenInputsAreEmpty() {
        // GIVEN
        int[] nums = new int[]{};
        int val = 0;

        // WHEN
        var response = solution.removeElement(nums, val);

        // THEN
        assertEquals(response, 0);
    }

    @Test
    void removeElement_shouldRRemoveVal_whenInputContainsTheSameElement() {
        // GIVEN
        int[] nums = new int[]{3, 2, 2, 3, 4};
        int val = 3;

        // WHEN
        var response = solution.removeElement(nums, val);

        // THEN
        assertEquals(response, 3);
    }

}