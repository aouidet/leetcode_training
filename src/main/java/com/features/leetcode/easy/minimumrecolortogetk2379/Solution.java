package com.features.leetcode.easy.minimumrecolortogetk2379;

public class Solution {

    public static final char WHITE_CHAR = 'W';

    public int minimumRecolors(String blocks, int k) {
        int minOperations;
        int whiteCount = 0;

        whiteCount = getWhiteCount(blocks, k, whiteCount);

        minOperations = whiteCount; // Initialisation avec la première fenêtre

        // Parcourir avec une fenêtre glissante
        for (int i = k; i < blocks.length(); i++) {
            // Ajouter le nouvel élément dans la fenêtre
            if (blocks.charAt(i) == WHITE_CHAR) {
                whiteCount++;
            }
            // Supprimer l'ancien élément qui sort de la fenêtre
            if (blocks.charAt(i - k) == WHITE_CHAR) {
                whiteCount--;
            }

            // Mettre à jour le minimum d'opérations nécessaires
            minOperations = Math.min(minOperations, whiteCount);
        }

        return minOperations;
    }

    private static int getWhiteCount(String blocks, int k, int whiteCount) {
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == WHITE_CHAR) {
                whiteCount++;
            }
        }
        return whiteCount;
    }

}
