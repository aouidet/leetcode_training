package com.features.leetcode.easy.minimumrecolortogetk2379;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxIntegerSequenceTest {

    private static Stream<Arguments> providerElementsParameters() {
        return Stream.of(Arguments.of("WBBWWBBWBW", 7, 3),
                Arguments.of("WBWBBBW", 2, 0));
    }

    @ParameterizedTest
    @MethodSource("providerElementsParameters")
    void minimumRecolors_shouldReturnZero_whenWeHaveKLessThanSuccessiveBlack(String str, int k, int expectedOutput) {
        // GIVEN
        Solution solution = new Solution();

        // WHEN
        final int result = solution.minimumRecolors(str, k);

        // THEN
        assertEquals(result, expectedOutput);
    }

}