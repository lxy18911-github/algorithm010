package com.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1.前序(Pre-order):根-左-右
 * 2.中序(In-order):左-根-右
 * 3.后序(Post-order):左-右-根
 */
public class _94_二叉树的中序遍历 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversalTree(list, root);
        return list;
    }

    public static void inorderTraversalTree(List<Integer> list, TreeNode node) {
        if (node == null) return;
        // 左
        inorderTraversalTree(list, node.left);
        // 根
        list.add(node.val);
        // 右
        inorderTraversalTree(list, node.right);
    }

    public static void main(String[] args) {
        List<Integer> nodes = Arrays.asList(1, null, 2, 3);

    }


}

class TreeNode {
    int val;
    TreeNode left,right;

    TreeNode(int x) {
        val = x;
    }
}