# DFS (Depth-First Search) – Parcours en Profondeur
L’algorithme DFS explore profondément chaque branche du graphe avant de revenir en arrière.


## Principe
- On choisit un nœud de départ.

- On visite un voisin non visité et on continue jusqu’à ne plus en trouver.

- On revient en arrière (backtracking) pour explorer d'autres chemins.

## Implémentation

DFS peut être implémenté avec :

1. Récursion (utilise la pile d’exécution).

2. Pile explicite (structure Stack).

   0
   /  \
   1   2
   / \  /  \
   3 4 5   6

## Explication pas à pas (DFS Traversal)

1️⃣ On commence par le nœud 0 → 0 est affiché

2️⃣ On va à son premier voisin 1 → 1 est affiché

3️⃣ On va à son premier voisin 3 → 3 est affiché

- 3 n'a pas de voisin, on remonte (backtracking)
- 
4️⃣ Retour à 1, on prend son autre voisin 4 → 4 est affiché

- 4 n'a pas de voisin, on remonte

5️⃣ Retour à 0, on prend son autre voisin 2 → 2 est affiché

6️⃣ On va à son premier voisin 5 → 5 est affiché

- 5 n'a pas de voisin, on remonte

7️⃣ Retour à 2, on prend son autre voisin 6 → 6 est affiché

- 6 n'a pas de voisin, on termine.