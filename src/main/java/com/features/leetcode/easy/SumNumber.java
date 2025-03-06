package com.features.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SumNumber {
    public int[] process(int[] sums, int target) {

        Map<Integer, Integer> mapResult = new HashMap<>();

        for (int i = 0; i < sums.length; i++) {
            final int complement = target - sums[i];
            if(mapResult.containsKey(complement)) {
                return new int[] {mapResult.get(complement), i};
            }
            mapResult.put(sums[i], i); // 2, 7,
        }
        return null;
    }
}
