package com.features.leetcode.medium.minimumIndex;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    private static Stream<Arguments> provideInvalidParametersT() {
        return Stream.of(Arguments.of(List.of(), -1), Arguments.of(List.of(3, 3, 3, 3, 7, 2, 2), -1));
    }

    private static Stream<Arguments> provideValidParametersT() {
        return Stream.of(Arguments.of(List.of(1, 2, 2, 2), 2), Arguments.of(List.of(2, 1, 3, 1, 1, 1, 7, 1, 2, 1), 4));
    }

    @DisplayName("Return -1 when no split solution is found")
    @ParameterizedTest(name = "minimum index found for {0} is :  {1}")
    @MethodSource("provideInvalidParametersT")
    void minimumIndex_shouldReturnMinus1_whenNotFoundSplitSolution(List<Integer> nums, int expectedResult) {
        int result = solution.minimumIndex(nums);
        assertEquals(result, expectedResult);
    }

    @DisplayName("Return -1 when no split solution is found")
    @ParameterizedTest(name = "minimum index found for {0} is :  {1}")
    @MethodSource("provideValidParametersT")
    void minimumIndex_shouldReturnResult_whenFoundMinIndexForSplit(List<Integer> nums, int expectedResult) {
        int result = solution.minimumIndex(nums);
        assertEquals(result, expectedResult);
    }

}