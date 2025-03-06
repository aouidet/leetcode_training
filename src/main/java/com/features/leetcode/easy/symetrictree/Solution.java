package com.features.leetcode.easy.symetrictree;

public class Solution {

    public boolean isSymmetric(TreeNode root) {

       if (root == null) {
           return true;
       }
       return isSym(root.left, root.right);
    }

    private boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }

        return (left.val == right.val)
                && isSym(left.left, right.right)
                && isSym(left.right, right.left);
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2, new TreeNode(2), new TreeNode(4));
        root.right = new TreeNode(2, new TreeNode(2), new TreeNode(4));
        System.out.println(solution.isSymmetric(root));
    }
}
