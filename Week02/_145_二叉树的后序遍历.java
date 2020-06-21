package com.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.前序(Pre-order):根-左-右
 * 2.中序(In-order):左-根-右
 * 3.后序(Post-order):左-右-根
 */
public class _145_二叉树的后序遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversalTree(list, root);
        return list;
    }

    public void postorderTraversalTree(List<Integer> list, TreeNode node) {
        if (node == null) return;
        // 左
        postorderTraversalTree(list, node.left);
        // 右
        postorderTraversalTree(list, node.right);
        // 根
        list.add(node.val);
    }
}
