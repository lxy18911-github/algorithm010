package com.leetcode.algorithm.array;

public class _45_跳跃游戏II {
    /**
     * 给定一个非负整数数组，你最初位于数组的第一个位置。
     * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
     * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
     * 示例:
     * 输入: [2,3,1,1,4]
     * 输出: 2
     * 解释: 跳到最后一个位置的最小跳跃数是 2。
     *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
     * 说明:
     * 假设你总是可以到达数组的最后一个位置。
     * 链接：https://leetcode-cn.com/problems/jump-game-ii
     */

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int step = jump(nums);
        System.out.printf("\n step is : " + step);
    }

    public static int jump(int[] nums) {
        int step = 0, end = 0, position = 0, length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            System.out.printf("\n i : " + i);
            System.out.printf(" | position : " + position);
            System.out.printf(" | nums[" + i + "] : " + nums[i]);
            System.out.printf(" | step : " + step);
            System.out.printf(" | end : " + end);
            position = Math.max(position, nums[i] + i);
            if (end == i) {
                end = position;
                step++;
            }
        }
        return step;
    }

}
