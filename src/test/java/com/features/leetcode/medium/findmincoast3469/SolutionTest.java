package com.features.leetcode.medium.findmincoast3469;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    private static Stream<Arguments> providerThreeOrFewerElementsParameters() {
        return Stream.of(
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{3, 8, 5}, 8),
                Arguments.of(new int[]{3, 5}, 5),
                Arguments.of(new int[]{3}, 3)
                );
    }

    private static Stream<Arguments> providerMoreThanThreeElementsParameters() {
        return Stream.of(
                Arguments.of(new int[]{6,2,8,4}, 12),
                Arguments.of(new int[]{2,1,3,3}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("providerThreeOrFewerElementsParameters")
    void findMinCoastal_shouldReturnMaxItem_whenWeHaveExactlyThreeOrFewerElements(int[] nums, int target) {
       // GIVEN
        Solution solution = new Solution();
        // WHEN
        var result = solution.minCost(nums);
        // THEN
        Assertions.assertEquals(target, result);
    }

    @ParameterizedTest
    @MethodSource("providerMoreThanThreeElementsParameters")
    void findMinCoastal_shouldReturnMaxItem_whenWeHaveMoreThanThreeElements(int[] nums, int target) {
        // GIVEN
        Solution solution = new Solution();
        // WHEN
        var result = solution.minCost(nums);
        // THEN
        Assertions.assertEquals(target, result);
    }

}