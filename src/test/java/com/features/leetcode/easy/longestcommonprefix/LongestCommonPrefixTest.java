package com.features.leetcode.easy.longestcommonprefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
     void longestCommonPrefix_shouldReturnEmpty_whenArraysIsEmpty() {

        // GIVEN
        String [] inputs = {};

        // WHEN
        final String result = longestCommonPrefix.process(inputs);

        // THEN
        Assertions.assertEquals(result, "");
    }

    // array contains only two elements with single characters = ["l", "lL"]
    @Test
    void longestCommonPrefix_shouldReturnCharacterL_whenArraysContainsOnlyTwoElements() {

        // GIVEN
        String [] inputs = {"L", "LL"};

        // WHEN
        final String result = longestCommonPrefix.process(inputs);

        // THEN
        Assertions.assertEquals(result, "L");
    }

    // array contains only two elements with single characters = ["flower","flow","flight"]
    @Test
    void longestCommonPrefix_shouldReturnCharacterfl_whenArraysContainsMultipleElements() {

        // GIVEN
        String [] inputs = {"flower","flow","flight"};

        // WHEN
        final String result = longestCommonPrefix.processOpt(inputs);

        // THEN
        Assertions.assertEquals(result, "fl");
    }
    // array contains only two elements with single characters = ["flower","flow","flight"]
    @Test
    void longestCommonPrefix_shouldReturnCEmpty_whenArraysContainsMultipleElements() {

        // GIVEN
        String [] inputs = {"dog","racecar","car"};

        // WHEN
        final String result = longestCommonPrefix.processOpt(inputs);

        // THEN
        Assertions.assertEquals(result, "");
    }
    @Test
    void longestCommonPrefix_shouldReturnEmpty_whenArraysContainsMultipleElements() {

        // GIVEN
        String [] inputs = {"flower","flow","flight", "dog"};

        // WHEN
        final String result = longestCommonPrefix.processOpt(inputs);

        // THEN
        Assertions.assertEquals(result, "");
    }

}
