package com.features.leetcode.easy;

import com.features.leetcode.medium.minimumIndex.EntryModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxOccurrenceCharactersTest {

    @Test
    void getMaxOccurrenceCharacters() {
        // GIVEN
        MaxOccurrenceCharacters solution = new MaxOccurrenceCharacters();
        int[] nums = new int[]{3,3,3,1,2,2,3};

        // WHEN
        EntryModel result = solution.getMaxOccurrenceCharacters(nums);

        // THEN
        Assertions.assertEquals(result.occurrence(), 4);
        Assertions.assertEquals(result.value(), 3);
    }

}