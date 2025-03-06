package com.features.leetcode.easy.addbinary;

public class Solution {

    public String addBinary(String a, String b) {
        final StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        // Parcourir les deux chaînes en partant de la fin
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0; // Extraire le chiffre de 'a' ou 0
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0; // Extraire le chiffre de 'b' ou 0

            int sum = digitA + digitB + carry; // Calculer la somme
            result.append(sum % 2);           // Ajouter le reste (0 ou 1) au résultat
            carry = sum / 2;
        }
        return result.reverse().toString(); // Inverser et retourner la chaîne finale
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1")); // 100
        System.out.println(solution.addBinary("1010", "1011")); // 10101
    }
}
