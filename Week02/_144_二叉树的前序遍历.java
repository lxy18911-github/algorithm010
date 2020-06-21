package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.前序(Pre-order):根-左-右
 * 2.中序(In-order):左-根-右
 * 3.后序(Post-order):左-右-根
 */
public class _144_二叉树的前序遍历 {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalTree(list, root);
        return list;
    }

    public static void preorderTraversalTree(List<Integer> list, TreeNode node) {
        if (node == null) return;
        // 根
        list.add(node.val);
        // 左
        preorderTraversalTree(list, node.left);
        // 右
        preorderTraversalTree(list, node.right);
    }

}
