package com.features.leetcode.brutforceVsSlidingwindow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxIntegerSequenceTest {

    final MaxIntegerSequence maxIntegerSequence = new MaxIntegerSequence();

    @DisplayName("Brut force algorythme")
    @ParameterizedTest(name = "max sub_sequence for {0} with k = {1} is {2}")
    @MethodSource("provideParametersT")
    void maxSumBrutForce_shouldReturnRightResult(int[] nums, int k, int expectedResult) {
        // GIVEN
        // WHEN
        int result = maxIntegerSequence.maxSumBrutForce(nums, k);

        // THEN
        assertEquals(result, expectedResult);
    }

    @DisplayName("Slide window algorythme")
    @ParameterizedTest(name = "max sub_sequence for {0} with k = {1} is {2}")
    @MethodSource("provideParametersT")
    void maxSumSlidingWindow_shouldReturnRightResult(int[] nums, int k, int expectedResult) {
        // GIVEN
        // WHEN
        int result = maxIntegerSequence.maxSumSlidingWindow(nums, k);

        // THEN
        assertEquals(result, expectedResult);
    }

    private static Stream<Arguments> provideParametersT() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 5, 1, 3, 2}, 3, 9)
        );
    }

}