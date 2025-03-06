package com.features.leetcode.easy.twosome;

import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        // Créez une table de hachage pour stocker les valeurs et leurs indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Parcourez le tableau
        for (int i = 0; i < nums.length; i++) {
            // Calculez le complément nécessaire
            int complement = target - nums[i];

            // Vérifiez si le complément existe dans la table de hachage
            if (map.containsKey(complement)) {
                // Retournez les indices si une solution est trouvée
                return new int[] { map.get(complement), i };
            }

            // Ajoutez la valeur actuelle et son indice dans la table de hachage
            map.put(nums[i], i);
        }

        // Si aucune solution n'est trouvée
        return new int[0];
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println(solution.twoSum(new int[]{2, 7, 11, 15}, 8));
    }

}
