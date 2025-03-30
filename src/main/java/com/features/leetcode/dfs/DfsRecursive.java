package com.features.leetcode.dfs;

import java.util.*;

public class DfsRecursive {

    // Traverse a binary graph depth-first
    private static void dfs (Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
       // check if node is visited
        if(visited.contains(node)) {
            return;
        }
        System.out.println(node + " "); // Display node
        visited.add(node);
        for(int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            System.out.println("neighbor : " + neighbor);
            dfs(graph, neighbor, visited);
        }
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5, 6));

        System.out.println("----  DFS Traversal ------");
        dfs(graph, 0, new HashSet<>());

    }
}
