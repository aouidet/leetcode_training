package com.features.leetcode.dfs;

import java.util.*;

public class Bfs {

    static void bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(start); // On ajoute le nœud de départ
        visited.add(start); // On marque comme visité

        while (!queue.isEmpty()) {
            int node = queue.poll(); // On prend le premier élément de la file
            System.out.print(node + " ");

            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5, 6));

        System.out.println("BFS Traversal:");
        bfs(graph, 0); // Démarrer BFS depuis le nœud 0
    }
}
