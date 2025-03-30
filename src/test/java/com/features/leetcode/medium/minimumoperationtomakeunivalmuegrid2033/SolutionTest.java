package com.features.leetcode.medium.minimumoperationtomakeunivalmuegrid2033;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void minOperations_shouldReturnRightValue_whenItPossible() {

        // GIVEN
        int[][] grid = {{2, 4}, {6, 8}};
        int x = 2;

        // WHEN
        int result = solution.minOperations(grid, x);

        // THEN
        assertEquals(result, 4);
    }

    @Test
    void minOperations_shouldReturnMinus1_whenNotPossible() {

        // GIVEN
        int[][] grid = {{1, 2}, {3, 4}};
        int x = 2;

        // WHEN
        int result = solution.minOperations(grid, x);

        // THEN
        assertEquals(result, -1);
    }


}
