package com.features.leetcode.easy;

import com.features.leetcode.medium.minimumIndex.EntryModel;
import org.springframework.ui.Model;

import java.util.HashMap;

public class MaxOccurrenceCharacters {

    public EntryModel getMaxOccurrenceCharacters(int[] nums) {
       EntryModel model = new EntryModel(0, 0);

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (var num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (var entry : freq.entrySet()) {
            if (entry.getValue() > model.occurrence()) {
                model = new EntryModel(entry.getKey(), entry.getValue());
            }
        }
        return model;
    }
}
