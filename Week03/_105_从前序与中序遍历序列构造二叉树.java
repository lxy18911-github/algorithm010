package com.leetcode.recursion;

public class _105_从前序与中序遍历序列构造二叉树 {
    /**
     * 根据一棵树的前序遍历与中序遍历构造二叉树。
     * 注意: 你可以假设树中没有重复的元素。
     * 例如，给出
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     * 返回如下的二叉树：
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
     */
    public static TreeNode buildTree(int[] preorder, int[] inorder) {

        return rebuildTree(preorder, 0, inorder, 0, inorder.length - 1);
    }

    private static TreeNode rebuildTree(int[] preorder, int p_start, int[] inorder, int i_start, int i_end) {
        // teminator
        if (p_start > preorder.length - 1 || i_start > i_end) return null;
        // process
        TreeNode root = new TreeNode(preorder[p_start]);
        int cri = 0; // current root index of inorder ele
        for (int i = i_start; i <= i_end; i++) {
            if (inorder[i] == root.val) {
                cri = i;
            }
        }
        // drill down
        root.left = rebuildTree(preorder, p_start + 1, inorder, i_start, cri - 1);
        root.right = rebuildTree(preorder, p_start + cri - i_start + 1, inorder, cri + 1, i_end);
        return root;
    }

    public static void main(String[] args) {

    }
}
