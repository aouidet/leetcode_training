package com.features.leetcode.medium.minoperationsthreshold;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            pq.offer((long) nums[i]);
        }
        int count = 0;
        while (!pq.isEmpty() && pq.size() > 1) {
            int x = Math.toIntExact(pq.poll());
            int y = Math.toIntExact(pq.poll());
            if(x < k || y < k) {
                long newVal = Math.min(x, y) * 2L + Math.max(x, y);
                pq.offer(newVal);
                count ++;
            } else {
                pq.offer((long) x);
                pq.offer((long) y);
                break;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.minOperations(new int[] {2, 11, 10, 1, 3}, 10));
    }
}
