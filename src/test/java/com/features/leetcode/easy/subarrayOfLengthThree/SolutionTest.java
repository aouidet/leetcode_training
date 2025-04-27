package com.features.leetcode.easy.subarrayOfLengthThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void countSubarrays_shouldReturnZero_whenHaveEmptyEntry() {
        // GIVEN
        int[] nums = new int[]{};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(0, result);
    }

    @Test
    void countSubarrays_shouldReturnZero_whenHaveOnlyThreeElementWithoutSatisfyCondition() {
        // GIVEN
        int[] nums = new int[]{1, 1, 1};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(0, result);
    }

    @Test
    void countSubarrays_shouldReturn1_whenHaveOnlyThreeElementWithSatisfyCondition() {
        // GIVEN
        int[] nums = new int[]{1, 4, 1};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(1, result);
    }

    @Test
    void countSubarrays_shouldReturn2_whenHaveGreaterThanThreeElementWithSatisfyCondition() {
        // GIVEN
        int[] nums = new int[]{1, 4, 1, 3, 6, 0};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(2, result);
    }

    @Test
    void countSubarrays_shouldReturn1_whenHaveGreaterThanThreeElementWithSatisfyCondition() {
        // GIVEN
        int[] nums = new int[]{-1,-4,-1,4};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(1, result);
    }

    @Test
    void countSubarrays_shouldReturn1_whenHaveGreaterThanThreeElementWithSatisfyCondition1() {
        // GIVEN
        int[] nums = new int[]{7,8,-3};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(1, result);
    }

    @Test
    void countSubarrays_shouldReturn0_whenHaveGreaterThanThreeElementWithSatisfyCondition1() {
        // GIVEN
        int[] nums = new int[]{-1,-5,-1,5,1};
        // WHEN
        int result = solution.countSubarrays(nums);
        // THEN
        assertEquals(0, result);
    }

}