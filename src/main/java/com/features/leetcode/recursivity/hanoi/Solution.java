package com.features.leetcode.recursivity.hanoi;

public class Solution {

    public void solveHanoi(int n, char source, char destination, char aux) {
        if(n == 1) {
            System.out.printf("deplacer le disque 1 de %s à %s%n", source, destination);
            return;
        }

        // etape 1: déplacer le n-1 disque de la source vers l'auxiliére
        solveHanoi(n -1, source, aux, destination);

        // étape 2 : déplacer le restant de la source vers la destination
        System.out.printf("deplacer le disque %s de %s à %s%n",n, source, destination);

        // etape 3 : déplacer le n-1 de l'aux vers la destination
        solveHanoi(n-1, aux, destination, source);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solveHanoi(2, 'A', 'B', 'C');
    }
}
