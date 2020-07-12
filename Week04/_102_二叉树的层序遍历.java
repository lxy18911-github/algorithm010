package com.leetcode.algorithm.tree;

import com.leetcode.algorithm.common.TreeNode;
import com.leetcode.algorithm.source.TreeUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102_二叉树的层序遍历 {

        /**
        给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
        示例：
        二叉树：[3,9,20,null,null,15,7],
            3
           / \
          9  20
            /  \
           15   7
        返回其层次遍历结果：
        [
          [3],
          [9,20],
          [15,7]
        ]
        来源：力扣（LeetCode）
        链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
        */

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        bfsWithQueue(root,list);
        return list;
    }

    private static void bfsWithQueue(TreeNode root, List<List<Integer>> list) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root != null)
            queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> subList = new ArrayList<Integer>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                subList.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            list.add(subList);
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtil.generatorBinaryTree();
        List<List<Integer>> list = levelOrder(root);
        System.out.printf("\n res is :" + list.toString());
    }
}
