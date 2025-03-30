package com.features.leetcode.medium.minimumoperationtomakeunivalmuegrid2033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    // Solution
    // vérifier que tou les élément % X sont égeaux
    // si tout sont égeaux ou pourra appliquer la conversion
    // pour optimiser les opération (minimum des opération)on va utiliser la médiane sur un tableau trié
    // nombre d'opération c'est combien d'operation pour transformer les valeur à la valeur du centre

    public int minOperations(int[][] grid, int x) {
        List<Integer> values = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;

        // récupérer les élement dans une list
        // O(m * n)
        for (int[] row : grid) {
            for (int num : row) {
                values.add(num);
            }
        }

        // vérifier si toutes les valeurs ont le méme % x
        // O(m * n)
        int mod = values.get(0) % x;
        for (int num : values) {
            if (num % x != mod) {
                return -1;
            }
        }
        // Trier la liste
        // O(m * n log(m * n))
        Collections.sort(values);


        int medium = values.get(values.size() / 2);
        // calcumer le nombre d'opération
        int operation = 0;
        // O(m * n)
        for (int num : values) {
            operation += Math.abs(num - medium) / x;
        }
        return operation;
    }

    // complexité

    // O(m * n) pour remplir la liste values.
    // O(m * n) pour vérifier les restes modulo x.
    // O(m * n log(m * n)) pour trier la liste values.
    // La complexité dominante est celle du tri, soit O(m * n log(m * n)).
    // Si la taille de la grille (m * n) est grande, la partie du tri sera l'élément le plus coûteux en termes de temps d'exécution.
}
