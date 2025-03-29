package com.features.leetcode.medium.alternatinggroup3208;

public class Solution {

    public static int numberOfAlternatingGroups(int[] colors, int k) {

        int n = colors.length;
        int count = 0;
        // construire n tableau d'altérnance
        int[] buffer = new int[n + k];
        // completer le tableau
        int[] complement = new int[k];
        System.arraycopy(colors, 0, complement, 0, k);

        buffer = mergeArrays(colors, complement);

        // Étape 2 : Fenêtre glissante sur le tableau étendu
        for (int i = 0; i < buffer.length - 1; i++) {

        }

        return count;
    }



    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] mergedArray = new int[n1 + n2];

        // Copier le premier tableau
        System.arraycopy(arr1, 0, mergedArray, 0, n1);
        // Copier le second tableau
        System.arraycopy(arr2, 0, mergedArray, n1, n2);

        return mergedArray;
    }

    public static void main(String[] args) {
        int result = numberOfAlternatingGroups(new int[]{0, 1, 0, 1, 0}, 3);
        System.out.println(result);
    }
}
