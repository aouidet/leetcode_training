package com.features.leetcode.easy.romainnumerals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RomanNumerals {

    public int romanToInt(String s) {

        final Map<Character, Integer> references = new HashMap<>();
        references.put('I', 1);
        references.put('V', 5);
        references.put('X', 10);
        references.put('L', 50);
        references.put('C', 100);
        references.put('D', 500);
        references.put('M', 1000);

        int result = references.get(s.charAt(s.length() -1));
        for (int i = s.length()-2; i >=0 ; i--) {
            if(references.get(s.charAt(i)) < references.get(s.charAt(i + 1))) {
                result -= references.get(s.charAt(i));
            } else {
                result += references.get(s.charAt(i));
            }
        }
        return result;
    }
}
