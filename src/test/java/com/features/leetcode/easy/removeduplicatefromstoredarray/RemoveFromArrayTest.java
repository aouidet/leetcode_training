package com.features.leetcode.easy.removeduplicatefromstoredarray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RemoveFromArrayTest {

    final RemoveFromArray removeFromArray = new RemoveFromArray();

     @DisplayName("Remove duplicate from an array")
     @ParameterizedTest(name = "length for {0} after removing duplicates is {1}")
     @MethodSource("provideParametersT")
    void removeDuplicates_shouldReturnRightResult(int[] nums, int expectedResult) {

        // GIVEN
        // WHEN
        int result = removeFromArray.removeDuplicates(nums);

        // THEN
        Assertions.assertEquals(expectedResult, result);
    }

    private static Stream<Arguments> provideParametersT() {
        return Stream.of(
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }
}
