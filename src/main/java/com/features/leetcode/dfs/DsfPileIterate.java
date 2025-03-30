package com.features.leetcode.dfs;

import java.util.*;

public class DsfPileIterate {

    private static void dfsIterate(Map<Integer, List<Integer>> graph, int start) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            int node = stack.pop();
            System.out.println(node + " ");
            visited.add(node);
            for(int neighbor: graph.getOrDefault(node, new ArrayList<>())) {
                stack.push(neighbor); // add neighbor to list
            }
        }
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5, 6));

        System.out.println("----  DFS Traversal with stack------");
        dfsIterate(graph, 0);

    }
}
