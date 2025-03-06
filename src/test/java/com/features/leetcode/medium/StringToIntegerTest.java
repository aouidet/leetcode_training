//package com.features.leetcode.medium;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class StringToIntegerTest {
//
//    StringToInteger useCase = new StringToInteger();
//
//    @Test
//    void myAtoi_should_returnInteger_whenInputContainOnlyNumber() {
//
//        // GIVEN
//        final String input = "12";
//        final int expectedResult = 12;
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnInteger_whenInputContainOnlyNumberAndWhiteSpace() {
//
//        // GIVEN
//        final String input = " 12 ";
//        final int expectedResult = 12;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnIntegerWithoutStartedBy0_whenInputContainOnlyNumberAndWhiteSpace() {
//
//        // GIVEN
//        final String input = " 012 ";
//        final int expectedResult = 12;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnZero_whenInputContainOnlyAlphabetic() {
//
//        // GIVEN
//        final String input = "test";
//        final int expectedResult = 0;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnZero_whenInputContainNegativeSignedNumberWithWhiteSpace() {
//
//        // GIVEN
//        final String input = "   -042";
//        final int expectedResult = -42;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnZero_whenInputContainPositiveSignedNumberWithWhiteSpace() {
//
//        // GIVEN
//        final String input = "   +042";
//        final int expectedResult = 42;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnZero_whenInputContainPositiveSignedNumberWithWhiteSpace1() {
//
//        // GIVEN
//        final String input = "1337c0d3";
//        final int expectedResult = 1337;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnZero_whenInputContainSpecialFormat() {
//
//        // GIVEN
//        final String input = "0-1";
//        final int expectedResult = 0;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//    @Test
//    void myAtoi_should_returnZero_whenInputContainSpecificRg() {
//
//        // GIVEN
//        final String input = "4193 with words";
//        final int expectedResult = 0;
//
//        // WHEN
//        int result = useCase.myAtoi(input);
//
//        // THEN
//        Assertions.assertEquals(result, expectedResult);
//    }
//
//}
//
//
//// input ="test"  ==> 0
//// input ="12"  ==> 12
//// input =" 12 "  ==> 12
//// input ="012" ==> 12
//// input ="  012" ==> 12
//// input ="   -042" ==> 42
//// input ="0-1" ==> 12
//// input ="words and 987" ==> 12
//// input ="1337c0d3" ==> 0
