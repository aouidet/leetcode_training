package com.features.leetcode.medium.findmincoast3469;

import java.util.*;

public class Solution {

    public int minCost(int[] nums) {
        int coast = 0;
        if(nums == null || nums.length == 0) return 0;
        if(nums.length <= 3) {
            return findMaxElement(nums);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int item : nums) {
            pq.add(item);
        }

        while(!pq.isEmpty()) {
            int firstItem = pq.poll();
            int secondItem = pq.poll();
            coast += Math.max(firstItem, secondItem);
            if(pq.size() <= 3) {
                coast += findMaxElement(pq.stream().mapToInt(value -> value).toArray());
                break;
            }
        }

        return coast;
    }

    private int findMaxElement(int[] nums) {
        return Arrays.stream(nums).boxed().max(Integer::compare).orElse(0);
    }
}
