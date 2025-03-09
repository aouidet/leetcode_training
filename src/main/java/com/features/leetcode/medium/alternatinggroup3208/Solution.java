package com.features.leetcode.medium.alternatinggroup3208;

public class Solution {

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;

        // parcourir les indices en considérant la circularité
        for (int i = 0; i < n; i++) {
            if (isAlternatingGroup(colors, i, k, n)) {
                count++;
            }
        }
        return count;
    }

    private boolean isAlternatingGroup(int[] colors, int start, int k, int n) {
        for (int j = 1; j < k; j++) {
            int prevIndex = (start + j - 1) % n; // Indice précédent (modulo n pour la circularité)
            int currentIndex = (start + j) % n; // Indice courant
            if (colors[prevIndex] == colors[currentIndex]) {
                return false;
            }
        }
        return true;
    }
}
