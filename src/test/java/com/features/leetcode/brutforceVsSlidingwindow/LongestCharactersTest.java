package com.features.leetcode.brutforceVsSlidingwindow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestCharactersTest {

    LongestCharacters solution = new LongestCharacters();

    @DisplayName("lengthOfLongestSubstring")
    @ParameterizedTest(name = "lengthOfLongestSubstring for  {0} is :  {1}")
    @MethodSource("provideParametersT")
    void maxSumSlidingWindow_shouldReturnRightResult(String str, int expectedResult) {
        int result = solution.lengthOfLongestSubstring(str);
        assertEquals(result, expectedResult);
    }

    private static Stream<Arguments> provideParametersT() {
        return Stream.of(
                Arguments.of("abcabcbb", 3), /// abc
                Arguments.of("abcabefgh", 7) // cabefgh
        );
    }
}