package com.features.leetcode.easy.romainnumerals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class RomanNumeralsTest {

    RomanNumerals romanNumerals = new RomanNumerals();

    @DisplayName("return valid correspondence roman values that are reference values")
    @ParameterizedTest(name = "{0} roman expression correspondence is {1}")
    @MethodSource("provideReferenceInput")
    public void romanToInt_shouldReturnResult_whenReferenceValues(String input, int valueCorrespondence) {

        // GIVEN
        // WHEN
        int result = romanNumerals.romanToInt(input);

        // THEN
        Assertions.assertEquals(valueCorrespondence, result);
    }

    @DisplayName("return valid correspondence roman values that are less than 5")
    @ParameterizedTest(name = "{0} roman expression correspondence is {1}")
    @MethodSource("provideParametersTNormal")
    public void romanToInt_shouldReturnResult_whenLessThan5(String input, int valueCorrespondence) {

        // GIVEN
        // WHEN
        int result = romanNumerals.romanToInt(input);

        // THEN
        Assertions.assertEquals(valueCorrespondence, result);
    }

    @DisplayName("return valid correspondence roman values that are less than 5")
    @ParameterizedTest(name = "{0} roman expression correspondence is {1}")
    @MethodSource("provideSpecialValues")
    public void romanToInt_shouldReturnResult_whenSpecial(String input, int valueCorrespondence) {

        // GIVEN
        // WHEN
        int result = romanNumerals.romanToInt(input);

        // THEN
        Assertions.assertEquals(valueCorrespondence, result);
    }

    private static Stream<Arguments> provideParametersTNormal() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("II", 2),
                Arguments.of("III", 3),
                Arguments.of("LVIII", 58)
        );
    }

    private static Stream<Arguments> provideSpecialValues() {
        return Stream.of(
                Arguments.of("IV", 4),
                Arguments.of("IX", 9),
                Arguments.of("XC", 90),
                Arguments.of("XL", 40)
        );
    }

    private static Stream<Arguments> provideReferenceInput() {
        return Stream.of(
                Arguments.of("I", 1),
                Arguments.of("V", 5),
                Arguments.of("X", 10),
                Arguments.of("L", 50),
                Arguments.of("C", 100),
                Arguments.of("D", 500),
                Arguments.of("M", 1000)
        );
    }
}
