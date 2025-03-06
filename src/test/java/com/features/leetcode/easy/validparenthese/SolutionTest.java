package com.features.leetcode.easy.validparenthese;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({
            "'()', true",
            "'()[]{}', true",
            "'(]', false",
            "'([)]', false",
            "'{[]}', true",
            "'', true",             // Cas vide
            "'{[(', false",         // Parenthèses ouvrantes non fermées
            "'[{]}', false",        // Mauvais ordre
            "'((((((((()))))))))', true" // Longue séquence
    })
    void isValid_shouldReturnTrue_whenSampleInputIsValid(String input, boolean expected) { // input : (), output true

        // GIVEN
        // WHEN

        boolean isValid = solution.isValid(input);

        // THEN
        assertEquals(expected, isValid);
    }
}