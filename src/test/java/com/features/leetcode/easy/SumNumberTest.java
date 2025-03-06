package com.features.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumNumberTest {

    @Test
    void sumNumber_shouldReturnResult_whenFoundComplementForTarget() {
        // test case : source : [2, 7, 11, 15], target : 9

        // GIVEN
        SumNumber useCase = new SumNumber();
        final int [] sums = {2, 7, 11, 15};
        final int target = 9;
        final int [] expectedResult = {0, 1};

        // WHEN
        var result = useCase.process(sums, target);

        // THEN
        Assertions.assertArrayEquals(result, expectedResult);
    }

}
