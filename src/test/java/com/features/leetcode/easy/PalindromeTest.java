package com.features.leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    void isPalindrome_shouldReturnTrue_whenInputIsPalindrome() {

        // GIVEN
        Palindrome useCase = new Palindrome();
        final int number = 121;


        // WHEN
        var result = useCase.isPalindrome(number);

        // THEN

        Assertions.assertTrue(result);

    }

    @Test
    void isPalindrome_shouldReturnFalse_whenInputIsNotPalindrome() {

        // GIVEN
        Palindrome useCase = new Palindrome();
        final int number = -121;


        // WHEN
        var result = useCase.isPalindrome(number);

        // THEN

        Assertions.assertFalse(result);

    }
}
