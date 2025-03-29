package com.features.leetcode.brutforceVsSlidingwindow;

public class MaxIntegerSequence {

    // brut force solution : complexity = O(n*k)
    public int maxSumBrutForce(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // slide window solution complexity = O(n)
    public int maxSumSlidingWindow(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;
        int sumWindow = 0;

        for (int i = 0; i < k; i++) {
            sumWindow += arr[i];
        }
        maxSum = sumWindow;

        for (int i = k; i < arr.length; i++) {
            sumWindow += arr[i] - arr[i - k]; // ajouter l'élement en entré et retirer le plus ancient
            maxSum = Math.max(maxSum, sumWindow);
        }

        return maxSum;

    }
}
