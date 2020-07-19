package com.leetcode.algorithm.array;

import java.util.Arrays;
import java.util.List;

public class _120_三角形最小路径和 {
    /**
     * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
     * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
     * 例如，给定三角形：
     * [
     * [2],
     * [3,4],R
     * [6,5,7],
     * [4,1,8,3]
     * ]
     * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
     * 链接：https://leetcode-cn.com/problems/triangle
     */
    public static void main(String[] args) {
        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(2),
                Arrays.asList(3, 4),
                Arrays.asList(6, 5, 7),
                Arrays.asList(4, 1, 8, 3));
        List<List<Integer>> lists2 = Arrays.asList(
                Arrays.asList(-1),Arrays.asList(2,3),Arrays.asList(1,-1,-3)
        );
        System.out.printf("\n res is :" + minimumTotal(lists2));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
            int minSum = 0, endIdx = triangle.get(0).size() - 1;
            for (List<Integer> list : triangle) {
                int min = list.get(0), len = list.size();
                System.out.printf("\n endIdx is :" + endIdx);
                if (len == 1) {
                    System.out.printf("\n 1 min is : " + min);
                    endIdx = len;
                    minSum += min;
                } else if (len > 1) {
                    for (int i = endIdx; i > 0; i--) {
                        int li = list.get(i);
                        min = Math.min(min, li);
                    }
                    endIdx = list.indexOf(min) + 1;
                    System.out.printf("\n 2 min is :" + min);
                    minSum += min;
                }
            }
            return minSum;
    }
}
