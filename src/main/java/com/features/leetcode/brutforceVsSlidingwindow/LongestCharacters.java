package com.features.leetcode.brutforceVsSlidingwindow;

import java.util.HashSet;

public class LongestCharacters {

    // Le Plus longue sous-chaîne sans caractère répété

    public int lengthOfLongestSubstring(String str) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < str.length(); end++) { // o(n)
        while (set.contains(str.charAt(end))) { // O(1) car on utilise un hashSet
            set.remove(str.charAt(start));
            start ++;
        }
        set.add(str.charAt(end));
        maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;

    }
}
