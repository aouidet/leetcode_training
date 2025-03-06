package com.features.leetcode.easy.sametree;

public class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }
        return isSame(p, q);
    }

    private boolean isSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }

        return (node1.val == node2.val) && isSameTree(node1.left, node2.left) && isSameTree(node1.right, node2.right);
    }
}
