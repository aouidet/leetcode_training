package com.features.leetcode.easy.longestcommonprefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixIntTest {

    LongestCommonPrefixInt longestCommonIntPrefix = new LongestCommonPrefixInt();

    @Test
    void longestCommonPrefix_shouldReturnZero_whenWeHaveAnEmptyArray() {

        // GIVEN
        int[] arr1 = new int[]{1, 10};
        int[] arr2 = new int[]{};

        // WHEN
        int result = longestCommonIntPrefix.longestCommonPrefix(arr1, arr2);

        // THEN
        Assertions.assertEquals(0, result);
    }

    @Test
    void longestCommonPrefix_shouldReturnThree_whenMatchedCommonPrefix() {

        // GIVEN
        int[] arr1 = new int[]{1,10,100};
        int[] arr2 = new int[]{1000};

        // WHEN
        int result = longestCommonIntPrefix.longestCommonPrefix(arr1, arr2);

        // THEN
        Assertions.assertEquals(3, result);
    }

    @Test
    void longestCommonPrefix_shouldReturnZero_whenWeHaveDifferentArraysValues() {

        // GIVEN
        int[] arr1 = new int[]{1, 10};
        int[] arr2 = new int[]{4, 44, 9};

        // WHEN
        int result = longestCommonIntPrefix.longestCommonPrefix(arr1, arr2);

        // THEN
        Assertions.assertEquals(0, result);
    }
}
