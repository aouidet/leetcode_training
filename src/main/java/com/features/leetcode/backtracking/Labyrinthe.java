package com.features.leetcode.backtracking;

public class Labyrinthe {

    static int N = 4;

    // 1 = chemin possible, 0 = mur
    static int[][] labyrinthe = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
    };

    // Grille pour marquer le chemin trouvé
    static int[][] solution = new int[N][N];

    public static void main(String[] args) {
        if (resoudreLabyrinthe(0, 0)) {
            afficherSolution();
        } else {
            System.out.println("Aucun chemin trouvé !");
        }
    }

    // Méthode principale de backtracking
    static boolean resoudreLabyrinthe(int x, int y) {
        // Vérifie si on est arrivé à la fin
        if (x == N - 1 && y == N - 1 && labyrinthe[x][y] == 1) {
            solution[x][y] = 1;
            return true;
        }

        // Vérifie si la cellule est valide
        if (estValide(x, y)) {
            // Marque la cellule comme partie du chemin
            solution[x][y] = 1;

            // Avancer vers la droite
            if (resoudreLabyrinthe(x + 1, y)) {
                return true;
            }

            // Avancer vers le bas
            if (resoudreLabyrinthe(x, y + 1)) {
                return true;
            }

            // Si aucun chemin ne marche, backtrack
            solution[x][y] = 0;
            return false;
        }

        return false;
    }

    // Vérifie si (x, y) est un mouvement valide
    static boolean estValide(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && labyrinthe[x][y] == 1);
    }

    // Affiche la matrice de solution
    static void afficherSolution() {
        System.out.println("Chemin trouvé :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }
}
