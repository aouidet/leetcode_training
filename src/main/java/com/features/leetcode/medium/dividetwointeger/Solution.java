package com.features.leetcode.medium.dividetwointeger;

public class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // identifier le signe
        boolean negative = (dividend < 0) ^ (divisor < 0); // XOR pour détecter les signes différents

        // convertir en valeur absolut
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;
        while (dvd >= dvs) { // tant que le divident est le plus grand ou egal
            long tmp = dvs, multiple = 1;
            while (dvd >= (tmp << 1)) {
                tmp <<= 1;
                multiple <<= 1;
            }

            // soustraire le plus grand puissance possible de vds
            dvd -= tmp;
            result += (int) multiple;
        }
        // appliqer le signal
        return negative ? -result : result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.divide(10, 3));
        System.out.println(solution.divide(7, -3));
        System.out.printf("expected 10, Result : %s %n", 5 << 1);
    }
}

//int temp = 3; // 0000 0011 (3 en binaire)
//temp = temp << 2; // Décalage de 2 bits à gauche ( x << n ===> x * 2 puissance n
//System.out.println(temp); // Affiche 12