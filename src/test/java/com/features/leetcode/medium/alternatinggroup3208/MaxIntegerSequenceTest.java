package com.features.leetcode.medium.alternatinggroup3208;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxIntegerSequenceTest {

    private static Stream<Arguments> providerElementsParameters() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 1, 0}, 3, 3),
                Arguments.of(new int[]{0, 1, 0, 0, 1, 0, 1}, 6, 2),
                Arguments.of(new int[]{1, 1, 0, 1}, 4, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("providerElementsParameters")
    void numberOfAlternatingGroups_shouldReturnResult_whenInvokedMethod(int[] colors, int k, int expectedOutput) {
        // GIVEN
        Solution solution = new Solution();

        // WHEN
        final int result = solution.numberOfAlternatingGroups(colors, k);

        // THEN
        assertEquals(result, expectedOutput);
    }
}