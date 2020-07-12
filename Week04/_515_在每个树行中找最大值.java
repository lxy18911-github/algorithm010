package com.leetcode.algorithm.tree;

import com.leetcode.algorithm.common.TreeNode;
import com.leetcode.algorithm.source.TreeUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 1.前序(Pre-order):根-左-右
 * 2.中序(In-order):左-根-右
 * 3.后序(Post-order):左-右-根
 */
public class _515_在每个树行中找最大值 {

    /**
     * 您需要在二叉树的每一行中找到最大的值。
     * 示例：
     * 输入:
     * 1
     * / \
     * 3   2
     * / \   \
     * 5   3   9
     * 输出: [1, 3, 9]
     * 链接：https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row
     */

    public static List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        bfsWithQueue(root, list);
        return list;
    }

    private static void bfsWithQueue(TreeNode root, List<Integer> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size(), max = Integer.MIN_VALUE;
//            if (list.isEmpty()) list.add(root.val);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            System.out.printf("\n max : " + max);
            list.add(max);
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.generatorBinaryTree();
        System.out.printf("\n res is : " + largestValues(root).toString());
    }
}