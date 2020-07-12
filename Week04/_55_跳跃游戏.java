package com.leetcode.algorithm.array;

public class _55_跳跃游戏 {
    /**
     * 给定一个非负整数数组，你最初位于数组的第一个位置。
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * 判断你是否能够到达最后一个位置。
     * 示例 1:
     * 输入: [2,3,1,1,4]
     * 输出: true
     * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
     * 示例 2:
     * 输入: [3,2,1,0,4]
     * 输出: false
     * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
     * 链接：https://leetcode-cn.com/problems/jump-game
     */

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int[] nums1 = {3, 2, 1, 0, 4};
        int[] nums2 = {0};
        System.out.printf("\n nums can jump : " + canJump(nums));
        System.out.printf("\n nums1 can jump : " + canJump(nums1));
        System.out.printf("\n nums2 can jump : " + canJump(nums2));
    }

    public static boolean canJump(int[] nums) {
        if (nums == null) return false;
        int endReachable = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= endReachable)
                endReachable = i;
        }
        return endReachable == 0;
    }

}
