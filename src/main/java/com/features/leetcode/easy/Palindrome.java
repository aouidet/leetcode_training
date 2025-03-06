package com.features.leetcode.easy;

public class Palindrome {

    public boolean isPalindrome(int number) {

        final String tmp = Integer.toString(number);
        final StringBuilder reversedTmp = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
           reversedTmp.insert(0, tmp.charAt(i));
        }
    return reversedTmp.toString().equals(tmp);
    }
}
